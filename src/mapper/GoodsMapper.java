package mapper;

import java.util.List;

import beans.Goods;

public interface GoodsMapper {
	public List<Goods> getGoods(String name);
	public void insertGoods(Goods Goods);
	public void deleteGoods(int id);
}
