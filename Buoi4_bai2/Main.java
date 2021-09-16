package pk_bai2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<NhanSu> lsNS = new ArrayList<NhanSu>();
		lsNS.add(new NhanSu("peter", 14, "1120"));
		lsNS.add(new NhanSu("alice", 14, "3129"));
		lsNS.add(new NhanSu("ryzip", 14, "4160"));
		lsNS.add(new NhanSu("gita", 14, "8127"));
		
		ArrayList<GiaoVien> lsGV = new ArrayList<GiaoVien>();
		lsGV.add(new GiaoVien("gv1", 28, "c1", 1));
		lsGV.add(new GiaoVien("gv2", 34, "c2", 2));
		lsGV.add(new GiaoVien("gv3", 19, "c3", 3));
		lsGV.add(new GiaoVien("gv4", 30, "c4", 4));
		
		ArrayList<NhanVienBaoVe> lsNVBV = new ArrayList<NhanVienBaoVe>();
		lsNVBV.add(new NhanVienBaoVe("bv1", 45, "d1", "Nam"));
		lsNVBV.add(new NhanVienBaoVe("bv2", 31, "d2", "Nam"));
		lsNVBV.add(new NhanVienBaoVe("bv3", 65, "d3", "Nu"));
		lsNVBV.add(new NhanVienBaoVe("bv4", 71, "d4", "Nu"));
	
		ArrayList<NhanVienVeSinh> lsNVVS = new ArrayList<NhanVienVeSinh>();
		lsNVVS.add(new NhanVienVeSinh("vs1", 76, "e1", 5000));
		lsNVVS.add(new NhanVienVeSinh("vs2", 51, "e2", 2500));
		lsNVVS.add(new NhanVienVeSinh("vs3", 27, "e3", 3000));
		lsNVVS.add(new NhanVienVeSinh("vs4", 82, "e4", 5600));
		
		ArrayList<HocSinh> lsHS = new ArrayList<HocSinh>();
		lsHS.add(new HocSinh("hs1", 13, "a1", "lop1"));
		lsHS.add(new HocSinh("hs2", 36, "a2", "lop2"));
		lsHS.add(new HocSinh("hs3", 18, "a3", "lop3"));
		lsHS.add(new HocSinh("hs4", 39, "a4", "lop4"));
		
		ArrayList<GiaoVienMon> lsGVM = new ArrayList<GiaoVienMon>();
		lsGVM.add(new GiaoVienMon("gvm1", 25, "cc1", 1, "Toan"));
		lsGVM.add(new GiaoVienMon("gvm2", 56, "cc2", 2, "Van"));
		lsGVM.add(new GiaoVienMon("gvm3", 27, "cc3", 3, "Ly"));
		lsGVM.add(new GiaoVienMon("gvm4", 91, "cc4", 4, "Hoa"));
		
		for(int i=0; i<lsGVM.size(); i++) {
			System.out.println(lsGVM.get(i).getTen() + " " + lsGVM.get(i).getTuoi() 
					   + " " + lsGVM.get(i).getCccd() + " " + lsGVM.get(i).getTo() + " " + lsGVM.get(i).getMon());
		}
	}

}
