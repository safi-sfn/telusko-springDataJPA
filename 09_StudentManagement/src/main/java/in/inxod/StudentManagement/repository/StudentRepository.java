package in.inxod.StudentManagement.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.inxod.StudentManagement.model.Students;

@Repository
public interface StudentRepository extends CrudRepository<Students, Integer> {

}
