---
title: "Aspose::Page::EPS::PageConstants 类"
linktitle: "PageConstants"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::EPS::PageConstants 类。此类定义了一组描述页面的常量。为各种边距、方向、重新缩放以及 C++ 中的标准页面尺寸提供了便利对象。"
type: docs
weight: 600
url: /zh/cpp/aspose.page.eps/pageconstants/
---
## PageConstants class


此类定义了一组描述页面的常量。提供了用于各种边距、方向、重新缩放和标准页面尺寸的便利对象。

```cpp
class PageConstants : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [BACKGROUND](./background/)() | 背景键。 |
| static [BACKGROUND_COLOR](./background_color/)() | 背景颜色键。 |
| static [FIT_TO_PAGE](./fit_to_page/)() | 适配内容到页面键。 |
| static [get_OrientationList](./get_orientationlist/)() |  |
| static [get_SizeList](./get_sizelist/)() |  |
| static [GetMargins](./getmargins/)(const System::String\&) | 获取页面边距值 |
| static [GetMargins](./getmargins/)(System::SharedPtr\<Margins\>, System::String) | 在指定方向下计算页面边距 мфдгуы |
| static [GetSize](./getsize/)(const System::String\&) | 在 \"Portrait\" 页面方向下计算页面尺寸 |
| static [GetSize](./getsize/)(const System::String\&, const System::String\&) | 在给定的页面方向下计算页面尺寸 |
| static [GetSize](./getsize/)(Drawing::Size, System::String) | 在给定的页面方向下计算页面尺寸 |
| static [MARGINS_LARGE](./margins_large/)() | \"Large\" 页面边距值 |
| static [MARGINS_MEDIUM](./margins_medium/)() | \"Medium\" 页面边距值 |
| static [MARGINS_SMALL](./margins_small/)() | \"Small\" 页面边距值 |
| static [MARGINS_ZERO](./margins_zero/)() | \"Zero\" 页面边距值 |
| static [ORIENTATION](./orientation/)() | 方向键，用于页面的命名方向，Portret 或 Landscape。 |
| static [ORIENTATION_BEST_FIT](./orientation_best_fit/)() | \"Best fit\" 方向值 |
| static [ORIENTATION_LANDSCAPE](./orientation_landscape/)() | \"Landscape\" 方向值 |
| static [ORIENTATION_PORTRAIT](./orientation_portrait/)() | \"Portrait\" 方向值 |
| static [PAGE_MARGINS](./page_margins/)() | [Page](../../aspose.page/) 边距键。 |
| static [PAGE_SIZE_](./page_size_/)() | [Page](../../aspose.page/) 大小键。 |
| static [SIZE_A3](./size_a3/)() | \"A3\" 页面尺寸值 |
| static [SIZE_A4](./size_a4/)() | \"A4\" 页面尺寸值 |
| static [SIZE_A5](./size_a5/)() | \"A5\" 页面尺寸值 |
| static [SIZE_A6](./size_a6/)() | \"A6\" 页面尺寸值 |
| static [SIZE_EXECUTIVE](./size_executive/)() | \"Executive\" 页面尺寸值 |
| static [SIZE_INTERNATIONAL](./size_international/)() | "International" 页面尺寸值 |
| static [SIZE_LEDGER](./size_ledger/)() | "Ledger" 页面尺寸值 |
| static [SIZE_LEGAL](./size_legal/)() | "Legal" 页面尺寸值 |
| static [SIZE_LETTER](./size_letter/)() | "Letter" 页面尺寸值 |
| static [TRANSPARENT](./transparent/)() | 透明背景键。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [VIEWING_ORIENTATION](./viewing_orientation/) | 视图方向键，用于通过旋转矩阵区分页面内容的方向。默认的视图方向矩阵是单位矩阵。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
