---
title: "System::setter_increment_wrap Methode"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Font für C++"
description: "System::setter_increment_wrap-Methode. Der Übersetzer übersetzt C#-Inkrementausdrücke, die auf die Eigenschaft einer Klasse abzielen, für die Setter und Getter definiert sind, in einen Aufruf dieser Funktion in C++."
type: docs
weight: 37500
url: /de/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


Der Übersetzer übersetzt C#-Inkrementausdrücke, die auf die Eigenschaft einer Klasse abzielen, für die Setter und Getter definiert sind, in einen Aufruf dieser Funktion.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Eigenschaft |
| Host | - Klasse der zu modifizierenden Instanz |
| HostGet | - Der Host selbst oder sein Basistyp, in dem der Getter der Eigenschaft definiert ist |
| HostSet | - Der Host selbst oder sein Basistyp, in dem der Setter der Eigenschaft definiert ist |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| host | Host *const | Ein Zeiger auf ein Objekt, dessen Eigenschaft inkrementiert werden soll |
| pGetter | T(HostGet::*)() | Funktionszeiger, der auf die Getter-Methode der Eigenschaft zeigt |
| pSetter | void(HostSet::*)(T) | Funktionszeiger, der auf die Setter-Methode der Eigenschaft zeigt |

### ReturnValue

Der inkrementierte Wert der Eigenschaft

## Siehe auch

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


Der Übersetzer übersetzt C#-Inkrementausdrücke, die auf die Eigenschaft einer Klasse abzielen, für die Setter und Getter definiert sind, in einen Aufruf dieser Funktion.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | Beschreibung |
| --- | --- |
| T | Der Typ der Eigenschaft |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| pGetter | T(*)() | Funktionszeiger, der auf die freie Getter‑Funktion der Eigenschaft zeigt |
| pSetter | void(*)(T) | Funktionszeiger, der auf die freie Setter‑Funktion der Eigenschaft zeigt |

### ReturnValue

Der inkrementierte Wert der Eigenschaft

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
