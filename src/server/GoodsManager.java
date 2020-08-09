package server;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import beans.Goods;
import mapper.GoodsMapper;
@Component
public class GoodsManager {
	@Autowired
	private GoodsMapper GoodsMapper;
	
	public void setGoodsMapper(GoodsMapper GoodsMapper) {
		this.GoodsMapper = GoodsMapper;
	}
	public List<Goods> getGoods(String name) {
		List<Goods> list=GoodsMapper.getGoods(name);
		return list;
	}
	public void insertGoods(Goods Goods){
		GoodsMapper.insertGoods(Goods);
	}
	public void deleteGoods(String id){
		int x=Integer.parseInt(id); 
		GoodsMapper.deleteGoods(x);
	}
}
