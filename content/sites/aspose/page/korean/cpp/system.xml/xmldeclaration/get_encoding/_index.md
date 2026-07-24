---
title: "System::Xml::XmlDeclaration::get_Encoding 메서드"
linktitle: "get_Encoding"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlDeclaration::get_Encoding 메서드. C++에서 XML 문서의 인코딩 수준을 반환합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml/xmldeclaration/get_encoding/
---
## XmlDeclaration::get_Encoding method


XML 문서의 인코딩 수준을 반환합니다.

```cpp
String System::Xml::XmlDeclaration::get_Encoding()
```


### ReturnValue

유효한 문자 인코딩 이름입니다.
## 비고



XML에서 가장 일반적으로 지원되는 문자 인코딩 이름은 다음과 같습니다: |||
|-|-|
| 카테고리 | 인코딩 이름 |
| 유니코드 | UTF-8, UTF-16 |
| ISO 10646 | ISO-10646-UCS-2, ISO-10646-UCS-4 |
| ISO 8859 | ISO-8859-n (여기서 "n"은 1부터 9까지의 숫자입니다) |
| JIS X-0208-1997 | ISO-2022-JP, Shift_JIS, EUC-JP |

이 값은 선택 사항입니다. 값이 설정되지 않은 경우, 이 메서드는 [String::Empty](../../../system/string/empty/)을 반환합니다. 인코딩 속성이 포함되지 않은 경우, 문서를 기록하거나 저장할 때 UTF-8 인코딩이 사용된다고 가정합니다.
## 또 보기

* Class [String](../../../system/string/)
* Class [XmlDeclaration](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
