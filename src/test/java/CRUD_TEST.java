import mapper.BrandMapper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pojo.Brand;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CRUD_TEST {
    static BrandMapper brandMapper;

    @BeforeClass
    public static void getsession(){
        brandMapper =util.getSession.getBrandMapper();
    }
    @AfterClass
    public static void closeSession(){
        util.getSession.closeSession();
    }
    @Test
    public void selectAll_test(){
        System.out.println("[測試]查詢所有：");
        List<Brand> brands=new ArrayList<>();
        brands=brandMapper.selectAll();
        System.out.println(brands);
    }

    @Test
    public void selectById_test(){
        Integer id= new Random().nextInt(3)+1;
        System.out.println("[測試]根據ID查詢(查詢ID="+id+")");
        Brand brand =new Brand();
        brand=brandMapper.selectById(id);
        System.out.println(brand);
    }

    @Test
    public void Insert_test(){
        System.out.println("[測試]插入數據");
        System.out.print("插入前數據資料：呼叫→→→\t");
        selectAll_test();
        Brand brand = new Brand(null,"BrandNameTEST","companyameTEST",99,"descriptionTEST",9);
        brandMapper.Insert(brand);
        System.out.println("插入數據為："+brand);

        System.out.print("插入後數據資料：呼叫→→→\t");
        selectAll_test();
    }


    @Test
    public void Delete_test(){
        System.out.println("[測試]刪除數據ID=4之資料");
        List<Brand> brands=new ArrayList<>();
        System.out.print("刪除前數據資料：呼叫→→→\t");
        selectAll_test();
        Integer id= 4;
        brandMapper.DeleteById(id);
        System.out.print("刪除後數據資料：呼叫→→→\t");
        selectAll_test();
    }


}
