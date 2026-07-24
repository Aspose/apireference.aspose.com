---
title: "System::Collections::Generic::LinkedListNode sınıfı"
linktitle: "LinkedListNode"
second_title: "Aspose.Page için C++"
description: "System::Collections::Generic::LinkedListNode sınıfı. Bağlı listenin düğümü. Bağlı listede sarılmış std::list bir yineleyicisi üzerinde bir sarmalayıcı uygular. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3200
url: /tr/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


Bağlı listenin düğümü. Bağlı listede sarılmış std::list bir yineleyicisi üzerinde bir sarmalayıcı uygular. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| Parameter | Açıklama |
| --- | --- |
| T | Depolanan değer tipi. |
## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_List](./get_list/)() const | İçeren listeyi alır. |
| [get_Next](./get_next/)() const | Sonraki düğümü alır. |
| [get_Previous](./get_previous/)() const | Önceki düğümü alır. |
| [get_Value](./get_value/)() const | Depolanan değeri alır. |
| [LinkedListNode](./linkedlistnode/)(const T\&) | Yapıcı. |
| [set_Value](./set_value/)(const T\&) | Depolanan değeri ayarlar. |

## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
