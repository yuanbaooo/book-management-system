package net.jeeshop.services.front.product.impl;

import net.jeeshop.core.ServersManager;
import net.jeeshop.services.front.product.ProductService;
import net.jeeshop.services.front.product.bean.Product;
import net.jeeshop.services.front.product.bean.ProductStockInfo;
import net.jeeshop.services.front.product.dao.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl extends ServersManager<Product, ProductDao> implements
        ProductService {
    @Override
    @Autowired
    @Qualifier("productDaoImpl")
    public void setDao(ProductDao productDao) {
        this.dao = productDao;
    }

    @Override
    public void upGoods(String[] ids) {
        upOrDown(ids, 1);
    }

    @Override
    public void downGoods(String[] ids) {
        upOrDown(ids, 2);
    }

    /**
     * @param ids
     */
    private void upOrDown(String[] ids, int status) {
        if (ids == null || ids.length == 0) {
            return;
        }

        for (int i = 0; i < ids.length; i++) {
            Product goods = new Product();
            goods.setId(ids[i]);
            goods.setStatus(status);
            dao.update(goods);
        }
    }

    @Override
    public List<Product> search(Product e) {
        return dao.selectList(e);
    }

    @Override
    public List<Product> selectParameterList(String id) {
        return dao.selectParameterList(id);
    }

    @Override
    public List<ProductStockInfo> selectStockList(Product product) {
        return dao.selectStockList(product);
    }

    @Override
    public List<Product> selectListProductHTML(Product product) {
        return dao.selectListProductHTML(product);
    }

    @Override
    public List<Product> selectProductListByIds(Product p) {
        return dao.selectProductListByIds(p);
    }

    @Override
    public List<Product> selectHotSearch(Product p) {
        return dao.selectHotSearch(p);
    }

    @Override
    public List<Product> loadHotProductShowInSuperMenu(Product product) {
        return dao.loadHotProductShowInSuperMenu(product);
    }

    @Override
    public void updateHit(Product p) {
        dao.updateHit(p);
    }

    @Override
    public List<Product> selectPageLeftHotProducts(Product p) {
        return dao.selectPageLeftHotProducts(p);
    }

    @Override
    public List<Product> selectActivityProductList(Product p) {
        return dao.selectActivityProductList(p);
    }
}
