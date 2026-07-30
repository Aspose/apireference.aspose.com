---
title: "méthode System::With"
linktitle: "With"
second_title: "Aspose.Font pour C++"
description: "méthode System::With. Clone l'enregistrement de référence et applique le foncteur d'initialisation à celui-ci en C++."
type: docs
weight: 40200
url: /fr/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Clone l'enregistrement de référence et applique le foncteur d'initialisation à celui-ci.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Paramètre | Description |
| --- | --- |
| T | Type d'enregistrement à cloner. |
| A | Type de foncteur d'initialisation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| enregistrement | const SharedPtr\<T\>\& | Pointeur partagé vers l'objet à cloner et à initialiser. |
| initialiseur | const A\& | Foncteur d'initialisation appliqué au clone d'enregistrement. |

### ReturnValue

Pointeur partagé vers l'enregistrement cloné.

## Voir aussi

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::With(const T\&, const A\&) method


Copie l'enregistrement struct et applique le foncteur d'initialisation à celui-ci.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Paramètre | Description |
| --- | --- |
| T | Type d'enregistrement à copier. |
| A | Type de foncteur d'initialisation. |

| Paramètre | Type | Description |
| --- | --- | --- |
| enregistrement | const T\& | Enregistrement à copier et à initialiser. |
| initialiseur | const A\& | Foncteur d'initialisation appliqué à la copie d'enregistrement. |

### ReturnValue

Enregistrement copié.

## Voir aussi

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
