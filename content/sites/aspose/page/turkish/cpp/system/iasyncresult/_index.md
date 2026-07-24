---
title: "System::IAsyncResult sınıfı"
linktitle: "IAsyncResult"
second_title: "Aspose.Page için C++"
description: "System::IAsyncResult sınıfı. Asenkron işlemin durumunu temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığıt üzerinde ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 3100
url: /tr/cpp/system/iasyncresult/
---
## IAsyncResult class


Asenkron işlemin durumunu temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../makeobject/) işlevi kullanılarak tahsis edilmelidir. Bu tipin örneğini yığıt üzerinde ya da operator new ile oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class IAsyncResult : public virtual System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | Asenkron işlem hakkında bilgiyi içeren bir nesne döndürür. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | Asenkron işlemin tamamlanmasını beklemek için kullanılabilecek bir WaitHandle örneği döndürür. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | Asenkron işlemin senkron olarak tamamlanıp tamamlanmadığını gösteren bir değer döndürür. |
| virtual [get_IsCompleted](./get_iscompleted/)() | Asenkron işlemin tamamlanıp tamamlanmadığını gösteren bir değer döndürür. |
| virtual [~IAsyncResult](./~iasyncresult/)() | Yıkıcı. |
## Typedefs

| Typedef | Açıklama |
| --- | --- |
| [smart_ptr](./smart_ptr/) | Paylaşımlı işaretçi [IAsyncResult](./) için. |
## Ayrıca Bakınız

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
