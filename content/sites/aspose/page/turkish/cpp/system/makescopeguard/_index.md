---
title: "System::MakeScopeGuard yöntemi"
linktitle: "MakeScopeGuard"
second_title: "Aspose.Page için C++"
description: "System::MakeScopeGuard yöntemi. C++'ta ScopedGuard sınıfının örneklerini oluşturan bir fabrika işlevi."
type: docs
weight: 24700
url: /tr/cpp/system/makescopeguard/
---
## System::MakeScopeGuard method


ScopedGuard sınıfının örneklerini oluşturan bir fabrika işlevi.

```cpp
template<typename F> ScopeGuard<F> System::MakeScopeGuard(F f)
```


| Parameter | Açıklama |
| --- | --- |
| Bu | Oluşturulan ScopedGuard nesnesi tarafından çağrılacak fonksiyon nesnesinin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| f | F | ScopedGuard sınıfının yapıcısına geçirilecek fonksiyon nesnesi. |

### ReturnValue

ScopedGuard sınıfının yeni bir örneği

## Ayrıca Bakınız

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
