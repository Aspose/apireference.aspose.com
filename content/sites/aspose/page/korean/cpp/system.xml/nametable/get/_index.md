---
title: "System::Xml::NameTable::Get method"
linktitle: "가져오기"
second_title: "C++용 Aspose.Page"
description: "System::Xml::NameTable::Get method. 지정된 배열의 문자 범위와 동일한 문자를 포함하는 원자화된 문자열을 C++에서 반환합니다."
type: docs
weight: 300
url: /ko/cpp/system.xml/nametable/get/
---
## NameTable::Get(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


지정된 배열에서 지정된 문자 범위와 동일한 문자를 포함하는 원자화된 문자열을 반환합니다.

```cpp
const String & System::Xml::NameTable::Get(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| key | const ArrayPtr\<char16_t\>\& | 찾을 이름을 포함하는 문자 배열. |
| 시작 | int32_t | 이름의 첫 번째 문자를 지정하는 배열의 0 기반 인덱스입니다. |
| len | int32_t | 이름의 문자 수입니다. |

### ReturnValue

원자화된 문자열 또는 문자열이 아직 원자화되지 않은 경우 **nullptr**를 반환합니다. **len**이 0이면 [String::Empty](../../../system/string/empty/)이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Get(const String\&) method


지정된 값을 가진 원자화된 문자열을 반환합니다.

```cpp
const String & System::Xml::NameTable::Get(const String &value) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| value | const String\& | 찾을 이름. |

### ReturnValue

원자화된 문자열 객체 또는 문자열이 아직 원자화되지 않은 경우 **nullptr**.

## 또 보기

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
