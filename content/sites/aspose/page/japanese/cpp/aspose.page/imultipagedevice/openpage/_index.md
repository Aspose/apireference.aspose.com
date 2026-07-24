---
title: "Aspose::Page::IMultiPageDevice::OpenPage メソッド"
linktitle: "OpenPage"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::IMultiPageDevice::OpenPage メソッド。C++ で各ページをレンダリングする前にデバイスの必要な準備を行います。"
type: docs
weight: 400
url: /ja/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


各ページのレンダリング前にデバイスの必要な準備を行います。

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| width | 単精度浮動小数点数 | ページの幅。 |
| height | 単精度浮動小数点数 | ページの高さ。 |

### ReturnValue

開いたページの番号が選択されたページ番号の範囲内にある場合は true を返し、そうでない場合は false を返します。

## 参照

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


ページのレンダリング前にデバイスの必要な準備を行います。

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| title | System::String | ページのタイトル。 |

### ReturnValue

ページが要求された範囲に含まれる場合は true、そうでない場合は false を返します。指定されたページ番号の配列をレンダリングできるデバイスで使用されます。

## 参照

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
