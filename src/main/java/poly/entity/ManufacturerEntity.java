package poly.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="NHACUNGCAP")
public class ManufacturerEntity {
	@Id
	@Column(name="MaNCC")
	private String id;
	
	@Column(name="TenNCC")
	private String name;
	
	@Column(name="SDT")
	private String phone;

	@Column(name="Email")
	private String email;
	
	@Column(name="DiaChi")
	private String address;
	public ManufacturerEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ManufacturerEntity(String id, String name, String phone, String email, String address) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	
}
