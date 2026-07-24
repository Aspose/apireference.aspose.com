---
title: "Aspose::Page::XPS::XpsDocument::InsertPage メソッド"
linktitle: "InsertPage"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::InsertPage メソッド。C++ でインデックス位置にデフォルトページサイズの空白ページをドキュメントに挿入します。"
type: docs
weight: 4500
url: /ja/cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


*index* 番目の位置に、デフォルトページサイズの空のページをドキュメントに挿入します。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int32_t | ページを挿入すべき位置。 |
| アクティブ化 | bool | 挿入されたページをアクティブとして選択するかどうかを示すフラグ。 |

### ReturnValue

挿入されたページ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


*index* 番目の位置に、指定された *width* と *height* のサイズの空のページをドキュメントに挿入します。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int32_t | ページを挿入すべき位置。 |
| width | 単精度浮動小数点数 | 新しいページの幅。 |
| height | 単精度浮動小数点数 | 新しいページの高さ。 |
| アクティブ化 | bool | 挿入されたページをアクティブとして選択するかどうかを示すフラグ。 |

### ReturnValue

挿入されたページ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


*index* 番目の位置に、ページをドキュメントに挿入します。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| インデックス | int32_t | ページを追加すべき位置。 |
| page | System::SharedPtr\<XpsModel::XpsPage\> | 挿入する [Page](../../../aspose.page/)。 |
| アクティブ化 | bool | 挿入されたページをアクティブとして選択するかどうかを示すフラグ。 |

### ReturnValue

挿入されたページ。

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
