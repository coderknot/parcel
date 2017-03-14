public class Parcel{
  int mWeight;
  int mHeight;
  int mWidth;
  int mDepth;
  int mVolume;
  int mCostToShip;
  int mSurfaceArea;
  boolean mGiftWrapping;

  public Parcel(int weight, int height, int width, int depth){
     mWeight = weight;
     mHeight = height;
     mWidth = width;
     mDepth = depth;
     mCostToShip = 0;
     mSurfaceArea = 0;
     mVolume = 0;
     mGiftWrapping = false;
  }

  public void calculateVolume(){
    this.mVolume = this.mHeight * this.mWidth * this.mDepth;
  }

  public void calculateArea(){
    this.mSurfaceArea = 2*(this.mHeight*this.mWidth)+2*(this.mHeight*this.mDepth)+2*(this.mWidth * this.mDepth);
  }

  public void costToShip(String shipSpeed, int shipMiles){
    this.mCostToShip = mWeight + (shipMiles/100);
    if (shipSpeed.equals("1")){
      this.mCostToShip += 0;
    }else if (shipSpeed.equals("2")){
      this.mCostToShip *= 2;
    }
  }

}
