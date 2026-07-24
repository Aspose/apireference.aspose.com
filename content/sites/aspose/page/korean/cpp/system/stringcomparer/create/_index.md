---
title: "System::StringComparer::Create 메서드"
linktitle: "생성"
second_title: "C++용 Aspose.Page"
description: "System::StringComparer::Create 메서드. C++에서 문화권별 비교자를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system/stringcomparer/create/
---
## StringComparer::Create method


문화별 비교자를 생성합니다.

```cpp
static StringComparerPtr System::StringComparer::Create(const System::SharedPtr<System::Globalization::CultureInfo> &culture, bool ignoreCase)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 문화 | const System::SharedPtr\<System::Globalization::CultureInfo\>\& | 비교자를 생성할 문화권. |
| ignoreCase | bool | 비교자가 대소문자를 무시해야 하는지 여부. |

### ReturnValue

새로 생성된 비교자 객체를 가리키는 포인터.

## 또 보기

* Typedef [StringComparerPtr](../../stringcomparerptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [StringComparer](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
