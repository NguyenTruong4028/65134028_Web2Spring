package ntu.nguyentruong.ntuCMS.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ntu.nguyentruong.ntuCMS.models.Page;

@Repository
public interface PageRepository extends JpaRepository<Page,Integer> {
	// Ta có thể khai báo thêm các hàm ở đây
	// Sau đó xây dựng lớp để thực thi

}
