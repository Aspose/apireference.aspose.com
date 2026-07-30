---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs sınıfı"
linktitle: "InvokeCompletedEventArgs"
second_title: "Aspose.Font için C++"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs sınıfı. Bu sınıfın bir örneği, InvokeCompletedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'de fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 200
url: /tr/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


Bu sınıfın bir örneği, InvokeCompletedEventHandler temsilcisine argüman olarak geçirilir. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [get_Results](./get_results/)() | Asenkron işlem sonuçlarının bir koleksiyonunu döndürür. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | Yeni bir örnek oluşturur. |
## Alanlar

| Alan | Açıklama |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | Boş bir [EventArgs](../../system/eventargs/) paylaşımlı işaretçiyi (null-pointer) temsil eden statik bir üye. |
## Ayrıca Bakınız

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Font for C++](../../)
