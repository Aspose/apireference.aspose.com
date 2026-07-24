---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Remove メソッド"
linktitle: "Remove"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Remove メソッド。C++ でコレクションからキー/値のペアを削除します。"
type: docs
weight: 2200
url: /ja/cpp/aspose.page.eps.xmp/xmpmetadata/remove/
---
## XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) method


コレクションからキー/値のペアを削除します。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| 項目 | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | 削除されるキー/値のペア。 |

### ReturnValue

ペアが見つかり削除された場合は true。

## 参照

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Remove(const System::String\&) method


メタデータからエントリを削除します。

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::String &key) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| キー | const System::String\& | 削除するエントリのキー。 |

### ReturnValue

キーが削除された場合は True、そうでなければ false。

## 参照

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
