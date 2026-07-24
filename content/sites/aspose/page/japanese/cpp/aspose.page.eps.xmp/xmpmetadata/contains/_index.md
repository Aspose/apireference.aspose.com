---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Contains メソッド"
linktitle: "Contains"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Contains メソッド。C++ で指定されたキーと値のペアが辞書に含まれているかどうかを確認します。"
type: docs
weight: 500
url: /ja/cpp/aspose.page.eps.xmp/xmpmetadata/contains/
---
## XmpMetadata::Contains(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) const method


指定されたキーと値のペアが辞書に含まれているか確認します。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Contains(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) const override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 項目 | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | キーと値のペア。 |

### ReturnValue

このペアが見つかった場合は true。

## 参照

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Contains(const System::String\&) const method


キーがメタデータに含まれているか確認します。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Contains(const System::String &key) const
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| キー | const System::String\& | 検索するエントリのキー。 |

### ReturnValue

キーがメタデータに含まれている場合は True。

## 参照

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
