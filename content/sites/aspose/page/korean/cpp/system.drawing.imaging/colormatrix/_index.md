---
title: "System::Drawing::Imaging::ColorMatrix 클래스"
linktitle: "ColorMatrix"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::ColorMatrix 클래스. RGBAW 색 공간의 좌표를 포함하는 5x5 행렬을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 300
url: /ko/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


RGBAW 색 공간의 좌표를 포함하는 5x5 행렬을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class ColorMatrix : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | 새로운 [ColorMatrix](./) 클래스 인스턴스를 생성하고 단위 행렬의 값으로 초기화합니다. |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | 새로운 [ColorMatrix](./) 클래스 인스턴스를 생성하고 지정된 값으로 초기화합니다. |
| [get_Matrix00](./get_matrix00/)() const | 0번째 행 0번째 열의 값을 반환합니다. |
| [get_Matrix01](./get_matrix01/)() const | 0번째 행 1번째 열의 값을 반환합니다. |
| [get_Matrix02](./get_matrix02/)() const | 0번째 행 2번째 열의 값을 반환합니다. |
| [get_Matrix03](./get_matrix03/)() const | 0번째 행 3번째 열의 값을 반환합니다. |
| [get_Matrix04](./get_matrix04/)() const | 0번째 행 4번째 열의 값을 반환합니다. |
| [get_Matrix10](./get_matrix10/)() const | 1번째 행 0번째 열의 값을 반환합니다. |
| [get_Matrix11](./get_matrix11/)() const | 1번째 행 1번째 열의 값을 반환합니다. |
| [get_Matrix12](./get_matrix12/)() const | 1번째 행 2번째 열의 값을 반환합니다. |
| [get_Matrix13](./get_matrix13/)() const | 1번째 행 및 3번째 열에서 값을 반환합니다. |
| [get_Matrix14](./get_matrix14/)() const | 1번째 행 및 4번째 열에서 값을 반환합니다. |
| [get_Matrix20](./get_matrix20/)() const | 2번째 행 및 0번째 열에서 값을 반환합니다. |
| [get_Matrix21](./get_matrix21/)() const | 2번째 행 및 1번째 열에서 값을 반환합니다. |
| [get_Matrix22](./get_matrix22/)() const | 2번째 행 및 2번째 열에서 값을 반환합니다. |
| [get_Matrix23](./get_matrix23/)() const | 2번째 행 및 3번째 열에서 값을 반환합니다. |
| [get_Matrix24](./get_matrix24/)() const | 2번째 행 및 4번째 열에서 값을 반환합니다. |
| [get_Matrix30](./get_matrix30/)() const | 3번째 행 및 0번째 열에서 값을 반환합니다. |
| [get_Matrix31](./get_matrix31/)() const | 3번째 행 및 1번째 열에서 값을 반환합니다. |
| [get_Matrix32](./get_matrix32/)() const | 3번째 행 및 2번째 열에서 값을 반환합니다. |
| [get_Matrix33](./get_matrix33/)() const | 3번째 행 및 3번째 열에서 값을 반환합니다. |
| [get_Matrix34](./get_matrix34/)() const | 3번째 행 및 4번째 열에서 값을 반환합니다. |
| [get_Matrix40](./get_matrix40/)() const | 4번째 행 및 0번째 열에서 값을 반환합니다. |
| [get_Matrix41](./get_matrix41/)() const | 4번째 행 및 1번째 열에서 값을 반환합니다. |
| [get_Matrix42](./get_matrix42/)() const | 4번째 행 및 2번째 열에서 값을 반환합니다. |
| [get_Matrix43](./get_matrix43/)() const | 4번째 행 및 3번째 열에서 값을 반환합니다. |
| [get_Matrix44](./get_matrix44/)() const | 4번째 행 및 4번째 열에서 값을 반환합니다. |
| [idx_get](./idx_get/)(int, int) | 지정된 행 및 열에서 값을 반환합니다. |
| [idx_set](./idx_set/)(int, int, float) | 행렬의 지정된 위치에 지정된 값을 설정합니다. |
| [set_Matrix00](./set_matrix00/)(float) | 0번째 행 및 0번째 열에 값을 설정합니다. |
| [set_Matrix01](./set_matrix01/)(float) | 0번째 행 및 1번째 열에 값을 설정합니다. |
| [set_Matrix02](./set_matrix02/)(float) | 0번째 행 및 2번째 열에 값을 설정합니다. |
| [set_Matrix03](./set_matrix03/)(float) | 0번째 행 및 3번째 열에 값을 설정합니다. |
| [set_Matrix04](./set_matrix04/)(float) | 0번째 행 및 4번째 열에 값을 설정합니다. |
| [set_Matrix10](./set_matrix10/)(float) | 1번째 행 및 0번째 열에 값을 설정합니다. |
| [set_Matrix11](./set_matrix11/)(float) | 1번째 행 및 1번째 열에 값을 설정합니다. |
| [set_Matrix12](./set_matrix12/)(float) | 1번째 행 및 2번째 열에 값을 설정합니다. |
| [set_Matrix13](./set_matrix13/)(float) | 1번째 행 및 3번째 열에 값을 설정합니다. |
| [set_Matrix14](./set_matrix14/)(float) | 1번째 행 및 4번째 열에 값을 설정합니다. |
| [set_Matrix20](./set_matrix20/)(float) | 2번째 행 및 0번째 열에 값을 설정합니다. |
| [set_Matrix21](./set_matrix21/)(float) | 2번째 행 및 1번째 열에 값을 설정합니다. |
| [set_Matrix22](./set_matrix22/)(float) | 2번째 행 및 2번째 열에 값을 설정합니다. |
| [set_Matrix23](./set_matrix23/)(float) | 2번째 행 및 3번째 열에 값을 설정합니다. |
| [set_Matrix24](./set_matrix24/)(float) | 2번째 행 및 4번째 열에 값을 설정합니다. |
| [set_Matrix30](./set_matrix30/)(float) | 3번째 행 및 0번째 열에 값을 설정합니다. |
| [set_Matrix31](./set_matrix31/)(float) | 3번째 행 및 1번째 열에 값을 설정합니다. |
| [set_Matrix32](./set_matrix32/)(float) | 3번째 행 및 2번째 열에 값을 설정합니다. |
| [set_Matrix33](./set_matrix33/)(float) | 3번째 행 및 3번째 열에 값을 설정합니다. |
| [set_Matrix34](./set_matrix34/)(float) | 3번째 행 및 4번째 열에 값을 설정합니다. |
| [set_Matrix40](./set_matrix40/)(float) | 4번째 행 및 0번째 열에 값을 설정합니다. |
| [set_Matrix41](./set_matrix41/)(float) | 4번째 행 및 1번째 열에 값을 설정합니다. |
| [set_Matrix42](./set_matrix42/)(float) | 4번째 행 및 2번째 열에 값을 설정합니다. |
| [set_Matrix43](./set_matrix43/)(float) | 4번째 행 및 3번째 열에 값을 설정합니다. |
| [set_Matrix44](./set_matrix44/)(float) | 4번째 행 및 4번째 열에 값을 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
