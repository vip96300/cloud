package org.cloud.packet.server.repository;

import java.io.Serializable;

import org.cloud.packet.server.model.PacProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacProductRepository extends JpaRepository<PacProduct, Serializable> {

}
