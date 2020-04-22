package org.lyx.controll;

import com.github.pagehelper.PageInfo;
import com.sun.deploy.net.HttpResponse;
//import org.apache.commons.io.FileUtils;
import org.lyx.pojo.FoodInfo;
import org.lyx.pojo.Parames;
import org.lyx.service.FoodInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Controller
public class FoodInfoController {

    @Resource
    private FoodInfoService foodInfoService;

//    @RequestMapping("/list")
//    public String list(ModelMap map){
//
////        System.out.println("list1");
//
//        List<FoodInfo> list=foodInfoService.all();
//
////        for (FoodInfo food:
////             list) {
////            System.out.println(food);
////        }
////        System.out.println("list2");
//       map.addAttribute("list",list);
//
////        System.out.println("list3");
//        return "list";
//    }

//    @RequestMapping("/list")
//    public String list(ModelMap map, Parames parames){
//
////        System.out.println("list1");
//
//        PageInfo<FoodInfo> pageInfo=foodInfoService.getPageInfo(parames);
//
////        for (FoodInfo food:
////             list) {
////            System.out.println(food);
////        }
////        System.out.println("list2");
//        map.addAttribute("pageInfo",pageInfo);
//
////        System.out.println("list3");
//        return "list";
//    }

    @RequestMapping("/list")
    public String list(ModelMap map, Parames parames,FoodInfo foodInfo){

//        System.out.println("list1");

        PageInfo<FoodInfo> pageInfo=foodInfoService.findByName(foodInfo,parames);

//        for (FoodInfo food:
//             list) {
//            System.out.println(food);
//        }
//        System.out.println("list2");
        map.addAttribute("pageInfo",pageInfo);
        map.addAttribute("foodinfo",foodInfo);
//        System.out.println("list3");
        return "list";
    }

    @RequestMapping("/find")
    public String find(ModelMap map,int foodId){

//        System.out.println("list1");

        FoodInfo foodInfo=foodInfoService.findById(foodId);

//        System.out.println("list2");
        map.addAttribute("food",foodInfo);

//        System.out.println("list3");
        return "find";
    }

//    @RequestMapping(value = "/save",produces = "text/html;charset=utf-8")
////    @ResponseBody
//    public String save(@RequestParam("file") CommonsMultipartFile patrFile, FoodInfo foodInfo, HttpServletRequest request){
//
////        String path=request.getServletContext().getRealPath("/upload");
//
//        String path="c:/myupload";
//
//        String filename=patrFile.getOriginalFilename();
//
//        File file=new File(path+"/"+filename);
//
//        try (InputStream inputStream=patrFile.getInputStream()){
//
//
//            FileUtils.copyInputStreamToFile(inputStream,file);
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        //设置一下文件图片路径
//        foodInfo.setFoodImage(filename);
//
//        int count=foodInfoService.insert(foodInfo);
//
//
//        return "redirect:/list";
////        return "文件上传成功";
//    }
//
//    @RequestMapping(value = "/downs",produces ="text/html;charset=utf-8")
//    @ResponseBody
//    public String downs(HttpServletRequest request, HttpServletResponse response){
//
////        String path=request.getServletContext().getRealPath("/upload");
//
//        String path="c:/myupload";
//
//        File file=new File(path);
//
//        File[] files=file.listFiles();
//
//        String fileName=files[0].getName();
//
//        System.out.println("文件的名字："+fileName);
//
//        //下载文件头信息必须写的！
//        response.addHeader("content-disposition", "attachment;filename="+fileName);
//
//        try {
//            //文件拷贝
//            FileUtils.copyFile(files[0], response.getOutputStream());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
////        return "redirect:/list";
//        return "文件下载成功";
//    }

    @RequestMapping("/fupdate")
    public String fupdate(ModelMap map,int foodId){

//        System.out.println("list1");

        FoodInfo foodInfo=foodInfoService.findById(foodId);

//        System.out.println("list2");
        map.addAttribute("food",foodInfo);

//        System.out.println("list3");
        return "update";
    }

    @RequestMapping("/update")
    public String update(ModelMap map,FoodInfo foodInfo){

//        System.out.println("list1");

        int count=foodInfoService.update(foodInfo);

//        System.out.println("list2");
        System.out.println(count);

//        System.out.println("list3");
        return "index";
    }

    @RequestMapping("/delete")
    public String delete(ModelMap map,int foodId){

//        System.out.println("list1");

        int count=foodInfoService.delete(foodId);

//        System.out.println("list2");
        System.out.println(count);

//        System.out.println("list3");
        return "index";
    }


}
