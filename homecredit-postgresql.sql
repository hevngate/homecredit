
/* run using PostgreSQL 10 DB */
/* Create database homecredit */

CREATE DATABASE homecredit;

/* Create table M_MODULE on homecredit database */

CREATE TABLE m_module (
    id integer NOT NULL,
    user_id character varying NOT NULL,
    module_name character varying,
    module_order integer
);

/* insert data into table M_MODULE on homecredit database */
INSERT INTO public.m_module (user_id,module_name,module_order) VALUES 
('albert','PromoCard',1)
,('albert','CategoryCard',2)
,('albert','FlashSaleCard',3)
,('albert','HistoryCard',4)
,('albert','NewsCard',5)
,('johnny','PromoCard',2)
,('johnny','CategoryCard',1)
,('johnny','FlashSaleCard',3)
,('johnny','HistoryCard',4)
,('johnny','NewsCard',5)
,('patrick','PromoCard',3)
,('patrick','CategoryCard',1)
,('patrick','FlashSaleCard',5)
,('patrick','HistoryCard',2)
,('patrick','NewsCard',4)
;

