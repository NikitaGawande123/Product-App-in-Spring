package productCrudApp.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import jakarta.transaction.Transactional;
import productCrudApp.model.Product;

@Component
public class ProductDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate; 
	
	// method for create the product
	@Transactional
	public void CreateProduct(Product product) {
		this.hibernateTemplate.save(product);
	}
	
	//get all product
	public List<Product> getProducts()
	{
		List<Product> products = this.hibernateTemplate.loadAll(Product.class);
		return products;
	}
	
	//method for delete the single product
	@Transactional
	public void deleteProduct(int pid)
	{
		Product p = this.hibernateTemplate.load(Product.class, pid);
		this.hibernateTemplate.delete(p);
	}

	//get the single product
	public void getProduct(int pid)
	{
	   this.hibernateTemplate.get(Product.class, pid);
	}
	
}
