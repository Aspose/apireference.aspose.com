---
title: "System::Drawing::Font::GetHeight 方法"
linktitle: "GetHeight"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Font::GetHeight 方法。返回当前对象表示的字体的行间距，使用指定 Graphics 对象的当前单位（在 C++ 中）。"
type: docs
weight: 1900
url: /zh/cpp/system.drawing/font/getheight/
---
## Font::GetHeight(const SharedPtr\<Graphics\>\&) method


返回当前对象表示的字体的行间距，使用指定的 [Graphics](../../graphics/) 对象的当前单位。

```cpp
float System::Drawing::Font::GetHeight(const SharedPtr<Graphics> &graphics)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| graphics | const SharedPtr\<Graphics\>\& | 一个指定测量单位的 [Graphics](../../graphics/) 对象 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Graphics](../../graphics/)
* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
## Font::GetHeight(float) method


返回在具有指定垂直分辨率的显示设备上绘制时，当前对象表示的字体的高度。

```cpp
float System::Drawing::Font::GetHeight(float dpi=DEFAULT_FONT_OPERATIONS_DPI)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dpi | float | 显示设备的垂直分辨率 |

### ReturnValue

字体的高度（像素）

## 另见

* Class [Font](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Font for C++](../../../)
