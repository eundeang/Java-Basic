package oop1;

//객체 지
public class MusicPlayerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        // 시스템 켜기
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
        //볼륨 감소
        data.volume--;
        System.out.println("음악 플레이어 볼륨: " + data.volume);
    }
}
