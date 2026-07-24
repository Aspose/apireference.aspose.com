---
title: "Aspose::Page::EPS::XMP::XmpMetadata::Remove 메서드"
linktitle: "제거"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::XMP::XmpMetadata::Remove 메서드. C++에서 컬렉션에서 키/값 쌍을 제거합니다."
type: docs
weight: 2200
url: /ko/cpp/aspose.page.eps.xmp/xmpmetadata/remove/
---
## XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\&) method


컬렉션에서 키/값 쌍을 제거합니다.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::Collections::Generic::KeyValuePair<System::String, System::SharedPtr<XmpValue>> &item) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 항목 | const System::Collections::Generic::KeyValuePair\<System::String, System::SharedPtr\<XmpValue\>\>\& | 제거할 키/값 쌍. |

### ReturnValue

쌍이 발견되어 제거되면 true.

## 또 보기

* Class [KeyValuePair](../../../system.collections.generic/keyvaluepair/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XmpValue](../../xmpvalue/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
## XmpMetadata::Remove(const System::String\&) method


메타데이터에서 항목을 제거합니다.

```cpp
bool Aspose::Page::EPS::XMP::XmpMetadata::Remove(const System::String &key) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| key | const System::String\& | 제거할 항목의 키. |

### ReturnValue

키가 제거되면 True, 그렇지 않으면 false.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmpMetadata](../)
* Namespace [Aspose::Page::EPS::XMP](../../)
* Library [Aspose.Page for C++](../../../)
