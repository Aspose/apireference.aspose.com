---
title: "Aspose::Page::XPS::XpsModel::XpsTileMode 열거형"
linktitle: "XpsTileMode"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsTileMode 열거형. C++에서 타일링 브러시의 TileMode 속성에 대한 유효한 값들입니다."
type: docs
weight: 5500
url: /ko/cpp/aspose.page.xps.xpsmodel/xpstilemode/
---
## XpsTileMode enum


타일링 브러시의 TileMode 속성에 대한 유효한 값.

```cpp
enum class XpsTileMode
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| None | 0 | 이 모드에서는 단일 기본 타일만 그려집니다. 나머지 영역은 투명하게 남겨집니다. |
| Tile | 1 | 이 모드에서는 기본 타일이 그려지고, 나머지 영역은 기본 타일을 반복하여 채워집니다. 각 타일의 오른쪽 가장자리가 다음 타일의 왼쪽 가장자리에 맞닿고, 각 타일의 아래쪽 가장자리가 다음 타일의 위쪽 가장자리에 맞닿도록 합니다. |
| FlipX | 2 | 타일 배열은 Tile 타일 모드와 유사하지만, 교대로 열에 있는 타일이 수평으로 뒤집힙니다. 기본 타일은 뷰포트에 지정된 대로 배치됩니다. 이 타일의 왼쪽 및 오른쪽 열에 있는 타일은 수평으로 뒤집힙니다. |
| FlipY | 3 | 타일 배열은 Tile 타일 모드와 유사하지만, 교대로 행에 있는 타일이 수직으로 뒤집힙니다. 기본 타일은 뷰포트에 지정된 대로 배치됩니다. 위와 아래 행은 수직으로 뒤집힙니다. |
| FlipXY | 4 | 타일 배열은 Tile tile 모드와 유사하지만, 교대로 배치된 열의 타일은 수평으로 뒤집히고 교대로 배치된 행의 타일은 수직으로 뒤집힙니다. 기본 타일은 뷰포트에 지정된 대로 배치됩니다. |

## 또 보기

* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
