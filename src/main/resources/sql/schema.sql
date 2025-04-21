CREATE TABLE `crypto-notification`.`report_histories` (
  `id`          INT NOT NULL,
  `market`      VARCHAR(45) NOT NULL,
  `price`       VARCHAR(45) NOT NULL,
  `reported_at` DATETIME    NOT NULL,
  PRIMARY KEY (`id`)
);

ALTER TABLE `crypto-notification`.`report_histories`
MODIFY COLUMN `id` INT NOT NULL AUTO_INCREMENT;


