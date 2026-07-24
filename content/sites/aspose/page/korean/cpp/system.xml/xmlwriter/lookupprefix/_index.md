---
title: "System::Xml::XmlWriter::LookupPrefix 메서드"
linktitle: "LookupPrefix"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlWriter::LookupPrefix 메서드. 파생 클래스에서 재정의될 경우, 현재 네임스페이스 범위에 정의된 가장 가까운 접두사를 네임스페이스 URI에 대해 C++에서 반환합니다."
type: docs
weight: 800
url: /ko/cpp/system.xml/xmlwriter/lookupprefix/
---
## XmlWriter::LookupPrefix method


파생 클래스에서 재정의될 때, 현재 네임스페이스 범위에서 해당 네임스페이스 URI에 대해 정의된 가장 가까운 접두사를 반환합니다.

```cpp
virtual String System::Xml::XmlWriter::LookupPrefix(String ns)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| ns | String | 찾고자 하는 접두사의 네임스페이스 URI. |

### ReturnValue

현재 범위에서 일치하는 네임스페이스 URI가 발견되지 않을 경우, 일치하는 접두사 또는 **nullptr**.

## 또 보기

* Class [String](../../../system/string/)
* Class [XmlWriter](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
