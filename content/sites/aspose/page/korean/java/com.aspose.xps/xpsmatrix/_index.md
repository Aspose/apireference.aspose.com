---
title: "XpsMatrix"
second_title: "Aspose.Page용 Java API 참조"
description: "MatrixTransform 속성 요소 기능을 캡슐화하는 클래스."
type: docs
weight: 36
url: /ko/java/com.aspose.xps/xpsmatrix/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.XpsObject](../../com.aspose.xps/xpsobject)
```
public final class XpsMatrix extends XpsObject
```

MatrixTransform 속성 요소 기능을 캡슐화하는 클래스입니다. 이 요소는 요소들의 좌표 시스템을 조작하기 위해 사용되는 임의의 아핀 행렬 변환을 정의합니다.
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [deepClone()](#deepClone--) | 이 변환 행렬을 복제합니다. |
| [equals(XpsMatrix a, XpsMatrix b)](#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 실제 구현. |
| [equals(Object obj)](#equals-java.lang.Object-) | 지정된 객체가 이 인스턴스와 같은지 여부를 판단합니다. |
| [getClass()](#getClass--) |  |
| [getM11()](#getM11--) | M11 요소를 가져옵니다. |
| [getM12()](#getM12--) | M12 요소를 가져옵니다. |
| [getM21()](#getM21--) | M21 요소를 가져옵니다. |
| [getM22()](#getM22--) | M22 요소를 가져옵니다. |
| [getM31()](#getM31--) | M31 요소를 가져옵니다. |
| [getM32()](#getM32--) | M32 요소를 가져옵니다. |
| [hashCode()](#hashCode--) | 이 인스턴스에 대한 해시 코드를 반환합니다. |
| [isIdentity()](#isIdentity--) | 이 인스턴스가 단위 행렬인지 여부를 나타내는 값을 가져옵니다. |
| [multiply(XpsMatrix matrix)](#multiply-com.aspose.xps.XpsMatrix-) | 이 행렬에 기본(Prepend) 순서로 지정된  matrix  행렬을 곱합니다. |
| [multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)](#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-) | 이 행렬에  matrixOrder  로 지정된 순서로 지정된  matrix  행렬을 곱합니다. |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [op_Equality(XpsMatrix a, XpsMatrix b)](#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 연산자 == 를 구현합니다. |
| [op_Inequality(XpsMatrix a, XpsMatrix b)](#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-) | 연산자 ! 를 구현합니다. |
| [reset()](#reset--) | 이 Matrix를 단위 행렬로 재설정합니다. |
| [rotate(float angle)](#rotate-float-) | 이 Matrix에 기본(Prepend) 순서로  angle  만큼 시계 방향 회전을 적용합니다. |
| [rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)](#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | 이 Matrix에  matrixOrder  로 지정된 순서로  angle  만큼 시계 방향 회전을 적용합니다. |
| [rotateAround(float angle, Point2D pivot)](#rotateAround-float-java.awt.geom.Point2D-) | 이 Matrix에 기본(Prepend) 순서로  pivot  를 중심으로  angle  만큼 시계 방향 회전을 적용합니다. |
| [rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)](#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-) | 이 Matrix에  matrixOrder  로 지정된 순서로  pivot  를 중심으로  angle  만큼 시계 방향 회전을 적용합니다. |
| [scale(float scaleX, float scaleY)](#scale-float-float-) | 이 Matrix에 기본(Prepend) 순서로 지정된 스케일 벡터(scaleX 및 scaleY)를 적용합니다. |
| [scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)](#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | 이 Matrix에  matrixOrder  로 지정된 순서로 지정된 스케일 벡터(scaleX 및 scaleY)를 적용합니다. |
| [skew(double skewX, double skewY)](#skew-double-double-) | 지정된 스키 변환을 이 Matrix에 적용합니다. |
| [toString()](#toString--) | 이  XpsMatrix  인스턴스의 문자열 표현을 반환합니다. |
| [transform(Rectangle2D rect)](#transform-java.awt.geom.Rectangle2D-) | 이 Matrix가 나타내는 어파인 변환을 지정된 사각형에 적용합니다. |
| [transformPoint(Point2D point)](#transformPoint-java.awt.geom.Point2D-) | 이 Matrix가 나타내는 어파인 변환을 지정된 점에 적용합니다. |
| [transformPoints(Point2D[] points)](#transformPoints-java.awt.geom.Point2D---) | 이 Matrix가 나타내는 어파인 변환을 지정된 점 배열에 적용합니다. |
| [transformPoints(Point2D[] points, int startIndex, int numberOfPoints)](#transformPoints-java.awt.geom.Point2D---int-int-) | 이 Matrix가 나타내는 어파인 변환을 지정된 점 배열의 일부에 적용합니다. |
| [translate(float offsetX, float offsetY)](#translate-float-float-) | 지정된 변환 벡터를 이 Matrix에 적용합니다. |
| [translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)](#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-) | 지정된 변환 벡터를  matrixOrder  로 지정된 순서에 따라 이 Matrix에 적용합니다. |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### deepClone() {#deepClone--}
```
public XpsMatrix deepClone()
```


이 변환 행렬을 복제합니다.

**Returns:**
[XpsMatrix](../../com.aspose.xps/xpsmatrix) - Clone of this transformation matrix.
### equals(XpsMatrix a, XpsMatrix b) {#equals-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean equals(XpsMatrix a, XpsMatrix b)
```


실제 구현.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 첫 번째 행렬입니다. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 두 번째 행렬입니다. |

**Returns:**
boolean - 행렬이 같으면 [true]
### equals(Object obj) {#equals-java.lang.Object-}
```
public boolean equals(Object obj)
```


지정된 객체가 이 인스턴스와 같은지 여부를 판단합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| obj | java.lang.Object | 이 인스턴스와 비교할 객체. |

**Returns:**
boolean - 지정된 객체가 이 인스턴스와 같으면 true; 그렇지 않으면 false. obj 매개변수가 null인 경우.
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getM11() {#getM11--}
```
public float getM11()
```


M11 요소를 가져옵니다.

**Returns:**
float - M11 요소.
### getM12() {#getM12--}
```
public float getM12()
```


M12 요소를 가져옵니다.

**Returns:**
float - M12 요소.
### getM21() {#getM21--}
```
public float getM21()
```


M21 요소를 가져옵니다.

**Returns:**
float - M21 요소.
### getM22() {#getM22--}
```
public float getM22()
```


M22 요소를 가져옵니다.

**Returns:**
float - M22 요소.
### getM31() {#getM31--}
```
public float getM31()
```


M31 요소를 가져옵니다.

**Returns:**
float - M31 요소.
### getM32() {#getM32--}
```
public float getM32()
```


M32 요소를 가져옵니다.

**Returns:**
float - M32 요소.
### hashCode() {#hashCode--}
```
public int hashCode()
```


이 인스턴스에 대한 해시 코드를 반환합니다.

**Returns:**
int - 이 인스턴스에 대한 해시 코드로, 해시 알고리즘 및 해시 테이블과 같은 데이터 구조에서 사용하기에 적합합니다.
### isIdentity() {#isIdentity--}
```
public boolean isIdentity()
```


이 인스턴스가 단위 행렬인지 여부를 나타내는 값을 가져옵니다.

값: 이 인스턴스가 단위 행렬이면 True; 그렇지 않으면 false.

**Returns:**
boolean - 이 인스턴스가 단위 행렬인지 여부를 나타내는 값.
### multiply(XpsMatrix matrix) {#multiply-com.aspose.xps.XpsMatrix-}
```
public void multiply(XpsMatrix matrix)
```


이 행렬에 기본(Prepend) 순서로 지정된  matrix  행렬을 곱합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 행렬. |

### multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder) {#multiply-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void multiply(XpsMatrix matrix, XpsMatrix.MatrixOrder matrixOrder)
```


이 행렬에  matrixOrder  로 지정된 순서로 지정된  matrix  행렬을 곱합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| matrix | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 행렬. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 순서. |

### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### op_Equality(XpsMatrix a, XpsMatrix b) {#op-Equality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Equality(XpsMatrix a, XpsMatrix b)
```


연산자 == 를 구현합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 첫 번째 행렬입니다. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 두 번째 행렬입니다. |

**Returns:**
boolean - 연산자의 결과.
### op_Inequality(XpsMatrix a, XpsMatrix b) {#op-Inequality-com.aspose.xps.XpsMatrix-com.aspose.xps.XpsMatrix-}
```
public static boolean op_Inequality(XpsMatrix a, XpsMatrix b)
```


연산자 != 를 구현합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| a | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 첫 번째 행렬입니다. |
| b | [XpsMatrix](../../com.aspose.xps/xpsmatrix) | 두 번째 행렬입니다. |

**Returns:**
boolean - 연산자의 결과.
### reset() {#reset--}
```
public void reset()
```


이 Matrix를 단위 행렬로 재설정합니다.

### rotate(float angle) {#rotate-float-}
```
public void rotate(float angle)
```


이 Matrix에 기본(Prepend) 순서로  angle  만큼 시계 방향 회전을 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| angle | float | 각도. |

### rotate(float angle, XpsMatrix.MatrixOrder matrixOrder) {#rotate-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotate(float angle, XpsMatrix.MatrixOrder matrixOrder)
```


이 Matrix에  matrixOrder  로 지정된 순서로  angle  만큼 시계 방향 회전을 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| angle | float | 각도. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 순서. |

### rotateAround(float angle, Point2D pivot) {#rotateAround-float-java.awt.geom.Point2D-}
```
public void rotateAround(float angle, Point2D pivot)
```


이 Matrix에 기본(Prepend) 순서로  pivot  를 중심으로  angle  만큼 시계 방향 회전을 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| angle | float | 각도. |
| 피벗 | java.awt.geom.Point2D | 피벗 포인트. |

### rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder) {#rotateAround-float-java.awt.geom.Point2D-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void rotateAround(float angle, Point2D pivot, XpsMatrix.MatrixOrder matrixOrder)
```


이 Matrix에  matrixOrder  로 지정된 순서로  pivot  를 중심으로  angle  만큼 시계 방향 회전을 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| angle | float | 각도. |
| 피벗 | java.awt.geom.Point2D | 피벗 포인트. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 순서. |

### scale(float scaleX, float scaleY) {#scale-float-float-}
```
public void scale(float scaleX, float scaleY)
```


이 Matrix에 기본(Prepend) 순서로 지정된 스케일 벡터(scaleX 및 scaleY)를 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| scaleX | float | x 축 스케일. |
| scaleY | float | y 축 스케일. |

### scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder) {#scale-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void scale(float scaleX, float scaleY, XpsMatrix.MatrixOrder matrixOrder)
```


이 Matrix에  matrixOrder  로 지정된 순서로 지정된 스케일 벡터(scaleX 및 scaleY)를 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| scaleX | float | X 축 스케일. |
| scaleY | float | Y 축 스케일. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 순서. |

### skew(double skewX, double skewY) {#skew-double-double-}
```
public void skew(double skewX, double skewY)
```


지정된 스키 변환을 이 Matrix에 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| skewX | double | 왜곡 x. |
| skewY | double | 왜곡 y. |

### toString() {#toString--}
```
public String toString()
```


이  XpsMatrix  인스턴스의 문자열 표현을 반환합니다.

**Returns:**
java.lang.String - 문자열 표현
### transform(Rectangle2D rect) {#transform-java.awt.geom.Rectangle2D-}
```
public Rectangle2D transform(Rectangle2D rect)
```


이 Matrix가 나타내는 어파인 변환을 지정된 사각형에 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| rect | java.awt.geom.Rectangle2D | 사각형. |

**Returns:**
java.awt.geom.Rectangle2D - 변환된 사각형
### transformPoint(Point2D point) {#transformPoint-java.awt.geom.Point2D-}
```
public Point2D transformPoint(Point2D point)
```


이 Matrix가 나타내는 어파인 변환을 지정된 점에 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| 포인트 | java.awt.geom.Point2D | 점. |

**Returns:**
java.awt.geom.Point2D - 변환된 점
### transformPoints(Point2D[] points) {#transformPoints-java.awt.geom.Point2D---}
```
public void transformPoints(Point2D[] points)
```


이 Matrix가 나타내는 어파인 변환을 지정된 점 배열에 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 점들. |

### transformPoints(Point2D[] points, int startIndex, int numberOfPoints) {#transformPoints-java.awt.geom.Point2D---int-int-}
```
public void transformPoints(Point2D[] points, int startIndex, int numberOfPoints)
```


이 Matrix가 나타내는 어파인 변환을 지정된 점 배열의 일부에 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| points | java.awt.geom.Point2D[] | 점들. |
| startIndex | int | 시작 인덱스. |
| numberOfPoints | int | 포인트 수. |

### translate(float offsetX, float offsetY) {#translate-float-float-}
```
public void translate(float offsetX, float offsetY)
```


지정된 변환 벡터를 이 Matrix에 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| offsetX | float | 오프셋 X. |
| offsetY | float | 오프셋 Y. |

### translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder) {#translate-float-float-com.aspose.xps.XpsMatrix.MatrixOrder-}
```
public void translate(float offsetX, float offsetY, XpsMatrix.MatrixOrder matrixOrder)
```


지정된 변환 벡터를  matrixOrder  로 지정된 순서에 따라 이 Matrix에 적용합니다.

**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| offsetX | float | 오프셋 X. |
| offsetY | float | 오프셋 Y. |
| matrixOrder | [MatrixOrder](../../com.aspose.xps/matrixorder) | 순서. |

### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| 매개변수 | 유형 | 설명 |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

