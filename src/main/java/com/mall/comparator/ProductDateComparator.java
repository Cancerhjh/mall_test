
package com.mall.comparator;
import com.mall.pojo.Product;

import java.util.Comparator;

/*新品比较器把 创建日期晚的放前面*/
public class ProductDateComparator implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		return p1.getCreateDate().compareTo(p2.getCreateDate());
	}

}

