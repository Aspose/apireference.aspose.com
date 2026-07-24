---
title: "System::WeakReference<> 클래스"
linktitle: "WeakReference<>"
second_title: "C++용 Aspose.Page"
description: "System::WeakReference<> 클래스. 약한 참조를 나타내며, 객체를 참조하면서도 해당 객체가 C++에서 삭제될 수 있도록 허용합니다."
type: docs
weight: 7800
url: /ko/cpp/system/weakreference__/
---
## WeakReference<> class


객체를 참조하면서도 해당 객체가 삭제될 수 있도록 허용하는 약한 참조를 나타냅니다.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | 현재 [WeakReference](../weakreference/) 객체가 참조하고 있는 객체가 삭제되었는지 여부를 가져옵니다. |
| [get_Target](./get_target/)() const | 현재 [WeakReference](../weakreference/) 객체가 참조하고 있는 객체(대상)를 가져옵니다. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | 현재 [WeakReference](../weakreference/) 객체가 참조하고 있는 객체(대상)를 설정합니다. |
| [WeakReference](./weakreference/)() | 기본 생성자. |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr를 사용한 생성자. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | [WeakReference](../weakreference/) 클래스의 새 인스턴스를 초기화하고, 지정된 객체를 참조합니다. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | [WeakReference](../weakreference/) 클래스의 새 인스턴스를 초기화하고, 지정된 객체를 참조합니다. |
## 또 보기

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
