
create table mpi_match_issue (	id bigint(20) NOT NULL AUTO_INCREMENT, 
								date_created datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
								opencr_cruid varchar(36) NOT NULL,
								openmrs_uuid varchar(255) NOT NULL,
								given_name varchar(250) NULL,
								family_name varchar(250) NULL,
								tarv_nid  varchar(250) NULL,
								gender varchar(15) NOT NULL,
								birth_date varchar(20),
								status VARCHAR(50),
								PRIMARY KEY (id),
								UNIQUE KEY `unq_match_issue_opencr_cruid` (`opencr_cruid`)
							) ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table mpi_matched_record (id bigint(20) NOT NULL AUTO_INCREMENT, 
								date_created datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
								openmrs_uuid varchar(36) NOT NULL,
								opencr_cruid varchar(36) NOT NULL,
								match_issue_id bigint(20) NOT NULL, 
								given_name varchar(250) NULL,
								family_name varchar(250) NULL,
								tarv_nid  varchar(250) NULL,
								gender varchar(15) NOT NULL,
								birth_date varchar(20),
								transfered_to int(1),
								PRIMARY KEY (id),
								UNIQUE KEY `unq_matched_openmrs_uuid` (`match_issue_id`, `openmrs_uuid`),
								CONSTRAINT `matched_record_fk1` FOREIGN KEY (`match_issue_id`) REFERENCES `mpi_match_issue` (`id`)
							) ENGINE=InnoDB DEFAULT CHARSET=utf8;
							
create table mpi_config_match (	id bigint(20) NOT NULL AUTO_INCREMENT,
								type varchar(255) NOT NULL,
								active TINYINT(1),
                                last_page varchar(255),
								date_created datetime NOT NULL DEFAULT CURRENT_TIMESTAMP,
								PRIMARY KEY (id)
							) ENGINE=InnoDB DEFAULT CHARSET=utf8;				
