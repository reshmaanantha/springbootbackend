package com.workllama.springbootvuejsdemo.Validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//import org.hibernate.validator.constraintvalidation.HibernateConstraintValidatorContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.PropertyResolver;

public class ConfigurableSizeCharSequenceValidator implements ConstraintValidator<ConfigurableSize, CharSequence> {

    private final PropertyResolver propertyResolver;
    private int min;
    private int max;

    @Autowired
    public ConfigurableSizeCharSequenceValidator(PropertyResolver propertyResolver) {
        this.propertyResolver = propertyResolver;
    }

    @Override
    public void initialize(ConfigurableSize configurableSize) {
        String minProperty = configurableSize.minProperty();
        String maxProperty = configurableSize.maxProperty();
        this.min = "".equals(minProperty) ? 0 :
                propertyResolver.getRequiredProperty(minProperty, Integer.class);
        this.max = "".equals(maxProperty) ? Integer.MAX_VALUE :
                propertyResolver.getRequiredProperty(maxProperty, Integer.class);
        validateParameters();
    }

    private void validateParameters() {
    	
        if (this.min < 0) {
            throw new IllegalArgumentException("The min parameter cannot be negative.");
        } else if (this.max < 0) {
            throw new IllegalArgumentException("The max parameter cannot be negative.");
        } else if (this.max < this.min) {
            throw new IllegalArgumentException("The length cannot be negative.");
        }
       
    }

    @Override
    public boolean isValid(CharSequence value, ConstraintValidatorContext context) {
        if (value == null) {
            return true;
        } else {
            int length = value.length();
          //  System.out.println("Length "+length +"min" + this.min +" "+ max +"this.max");
            boolean retVal = length >= this.min && length <= this.max;
           //System.out.println(retVal);         
            return retVal;
        }
    }

}

