INSERT INTO `country` (`id`,  `name`) VALUES
(101,  'India'),
(231,  'United States'),
(247,'Others');



INSERT INTO `state` (`id`, `name`, `country_id`) VALUES
(17, 'Karnataka', 101),
(19, 'Kerala', 101),
(22, 'Maharashtra', 101),
(3921, 'Arizona', 231),
(3924, 'California', 231),
(3930, 'Florida', 231),
(4121,'Others',247);


INSERT INTO `city` (`id`, `name`, `state_id`) VALUES
(1531, 'Arsikere', 17),
(1532, 'Athni', 17),
(1533, 'Aurad', 17),
(1534, 'Badagavettu', 17),
(1535, 'Badami', 17),
(1536, 'Bagalkot', 17),
(1537, 'Bagepalli', 17),
(1538, 'Bailhongal', 17),
(1539, 'Baindur', 17),
(1540, 'Bajala', 17),
(1541, 'Bajpe', 17),
(1542, 'Banavar', 17),
(1543, 'Bangarapet', 17),
(1544, 'Bankapura', 17),
(1545, 'Bannur', 17),
(1546, 'Bantwal', 17),
(1547, 'Basavakalyan', 17),
(1548, 'Basavana Bagevadi', 17),
(1549, 'Belagula', 17),
(1550, 'Belakavadiq', 17),
(1558, 'Bengaluru', 17),
(2037, 'Sultans Battery', 19),
(2038, 'Sulthan Bathery', 19),
(2039, 'Talipparamba', 19),
(2040, 'Thaikkad', 19),
(2041, 'Thalassery', 19),
(2042, 'Thannirmukkam', 19),
(2043, 'Theyyalingal', 19),
(2044, 'Thiruvalla', 19),
(2045, 'Thiruvananthapuram', 19),
(2046, 'Thiruvankulam', 19),
(2541, 'Chinchani', 22),
(2542, 'Chinchwad', 22),
(2543, 'Chiplun', 22),
(2544, 'Chopda', 22),
(2545, 'Dabhol', 22),
(2546, 'Dahance', 22),
(2547, 'Dahanu', 22),
(2548, 'Daharu', 22),
(2549, 'Dapoli Camp', 22),
(42695, 'Casas Adobes', 3921),
(42696, 'Chandler', 3921),
(42697, 'Clarkdale', 3921),
(42698, 'Cottonwood', 3921),
(42699, 'Douglas', 3921),
(42700, 'Drexel Heights', 3921),
(42701, 'El Mirage', 3921),
(43595, 'Azalea Park', 3930),
(43596, 'Bal Harbour', 3930),
(43597, 'Bartow', 3930),
(43598, 'Bayonet Point', 3930),
(43599, 'Bayshore Gardens', 3930),
(43600, 'Beach', 3930),
(43601, 'Bellair-Meadowbrook Terrace', 3930),
(43602, 'Belle Glade', 3930),
(43603, 'Bellview', 3930),
(43604, 'Beverly Hills', 3930),
(42804, 'Albany', 3924),
(42805, 'Alhambra', 3924),
(42806, 'Aliso Viejo', 3924),
(42807, 'Alondra Park', 3924),
(42808, 'Alpine', 3924),
(42809, 'Alta Loma', 3924),
(42810, 'Altadena', 3924),
(42811, 'American Canyon', 3924),
(42812, 'Anaheim', 3924),
(48357,'Others',4121);

