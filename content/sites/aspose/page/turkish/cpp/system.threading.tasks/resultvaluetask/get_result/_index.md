---
title: "System::Threading::Tasks::ResultValueTask::get_Result metodu"
linktitle: "get_Result"
second_title: "Aspose.Page için C++"
description: "System::Threading::Tasks::ResultValueTask::get_Result metodu. C++'ta tamamlanmış görevin sonucunu alır."
type: docs
weight: 900
url: /tr/cpp/system.threading.tasks/resultvaluetask/get_result/
---
## ResultValueTask::get_Result method


Tamamlanmış görevin sonucunu alır.

```cpp
T System::Threading::Tasks::ResultValueTask<T>::get_Result() const
```


### ReturnValue

T Sonuç değeri.
## Açıklamalar



Eğer görev bir [ResultTask<T>](../../resulttask/) tarafından destekleniyorsa, bu metod sonucu bekleyecek ve önbelleğe alacaktır. Sonraki çağrılar, önbelleğe alınmış değeri beklemeden döndürecektir.

## Ayrıca Bakınız

* Class [ResultValueTask](../)
* Namespace [System::Threading::Tasks](../../)
* Library [Aspose.Page for C++](../../../)
