---
title: "System::Xml::NameTable::Add method"
linktitle: "Add"
second_title: "C++용 Aspose.Page"
description: "System::Xml::NameTable::Add method. 지정된 문자열을 원자화하고 C++에서 NameTable에 추가합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml/nametable/add/
---
## NameTable::Add(const ArrayPtr\<char16_t\>\&, int32_t, int32_t) method


지정된 문자열을 원자화하고 [NameTable](../)에 추가합니다.

```cpp
const String & System::Xml::NameTable::Add(const ArrayPtr<char16_t> &key, int32_t start, int32_t len) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| key | const ArrayPtr\<char16_t\>\& | 추가할 문자열을 포함하는 문자 배열. |
| 시작 | int32_t | 문자열의 첫 번째 문자를 지정하는 배열의 0 기반 인덱스. |
| len | int32_t | 문자열의 문자 수. |

### ReturnValue

원자화된 문자열 또는 [NameTable](../)에 이미 존재하는 경우 기존 문자열을 반환합니다. **len**이 0이면 [String::Empty](../../../system/string/empty/)이 반환됩니다.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## NameTable::Add(const String\&) method


지정된 문자열을 원자화하고 [NameTable](../)에 추가합니다.

```cpp
const String & System::Xml::NameTable::Add(const String &key) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| key | const String\& | 추가할 문자열. |

### ReturnValue

원자화된 문자열 또는 [NameTable](../)에 이미 존재하는 경우 기존 문자열.

## 또 보기

* Class [String](../../../system/string/)
* Class [NameTable](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
