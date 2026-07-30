---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength méthode"
linktitle: "GetNameValueLength"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength méthode. Convertit une chaîne passée depuis l'index spécifié en une instance de la classe NameValueHeaderValue en C++."
type: docs
weight: 900
url: /fr/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelength/
---
## NameValueHeaderValue::GetNameValueLength(String, int32_t, HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\>, System::SharedPtr\<NameValueHeaderValue\>\&) method


Convertit une chaîne passée depuis l'index spécifié en une instance de la classe [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<NameValueHeaderValue>> nameValueCreator, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | String | Une chaîne à analyser. |
| startIndex | int32_t | Une position de départ pour l'analyse. |
| nameValueCreator | HeaderFunc\<System::SharedPtr\<NameValueHeaderValue\>\> | Une fonction utilisée pour créer de nouvelles instances de la classe [NameValueHeaderValue](../). |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Une instance où un objet analysé sera assigné. |

### ReturnValue

Renvoie la longueur d'une sous-chaîne analysée, sinon 0.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
## NameValueHeaderValue::GetNameValueLength(String, int32_t, System::SharedPtr\<NameValueHeaderValue\>\&) method


Convertit une chaîne passée depuis l'index spécifié en une instance de la classe [NameValueHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueLength(String input, int32_t startIndex, System::SharedPtr<NameValueHeaderValue> &parsedValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | String | Une chaîne à analyser. |
| startIndex | int32_t | Une position de départ pour l'analyse. |
| parsedValue | System::SharedPtr\<NameValueHeaderValue\>\& | Une instance où un objet analysé sera assigné. |

### ReturnValue

Renvoie la longueur d'une sous-chaîne analysée, sinon 0.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
