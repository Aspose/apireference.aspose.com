---
title: "System::Xml::XmlResolver::ResolveUri 메서드"
linktitle: "ResolveUri"
second_title: "C++용 Aspose.Page"
description: "System::Xml::XmlResolver::ResolveUri 메서드. 파생 클래스에서 재정의될 경우, C++에서 기본 URI와 상대 URI로부터 절대 URI를 해결합니다."
type: docs
weight: 200
url: /ko/cpp/system.xml/xmlresolver/resolveuri/
---
## XmlResolver::ResolveUri method


파생 클래스에서 재정의될 때, 기본 URI와 상대 URI로부터 절대 URI를 해결합니다.

```cpp
virtual SharedPtr<Uri> System::Xml::XmlResolver::ResolveUri(SharedPtr<Uri> baseUri, String relativeUri)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| baseUri | SharedPtr\<Uri\> | 상대 URI를 해결하는 데 사용되는 기본 URI입니다. |
| relativeUri | String | 해결할 URI입니다. URI는 절대일 수도 있고 상대일 수도 있습니다. 절대인 경우, 이 값은 **baseUri** 값을 실제로 대체합니다. 상대인 경우, **baseUri**와 결합하여 절대 URI를 만듭니다. |

### ReturnValue

절대 URI 또는 상대 URI를 해결할 수 없는 경우 **nullptr**.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Uri](../../../system/uri/)
* Class [String](../../../system/string/)
* Class [XmlResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
