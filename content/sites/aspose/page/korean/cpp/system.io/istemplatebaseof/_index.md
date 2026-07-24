---
title: "System::IO::IsTemplateBaseOf typedef"
linktitle: "IsTemplateBaseOf"
second_title: "C++용 Aspose.Page"
description: "System::IO::IsTemplateBaseOf typedef. std::is_base_of<Base, Derived>에 해당하는 구현으로, 인스턴스화되지 않은 Base 템플릿 클래스가 인스턴스화된 Derived 템플릿 클래스에서 상속되는지를 판단합니다. C++에서 다중 상속이나 Base의 비공개 상속인 경우 실패합니다."
type: docs
weight: 4100
url: /ko/cpp/system.io/istemplatebaseof/
---
## IsTemplateBaseOf typedef


인스턴스화되지 않은 Base 템플릿 클래스가 인스턴스화된 Derived 템플릿 클래스로부터 상속되는지를 판단하는 std::is_base_of<Base, Derived> 대응을 나타냅니다. 다중 상속이거나 Base로부터 비공개 상속인 경우 실패합니다.

```cpp
using System::Details::IsTemplateBaseOf =  typename IsTemplateBaseOfImpl<Base, Derived>::type
```


## 또 보기

* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
