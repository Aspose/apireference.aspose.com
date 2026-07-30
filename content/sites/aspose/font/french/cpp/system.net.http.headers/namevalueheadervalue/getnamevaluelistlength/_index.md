---
title: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength méthode"
linktitle: "GetNameValueListLength"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength méthode. Convertit une chaîne passée depuis l'index spécifié en une collection d'instances de la classe NameValueHeaderValue et renvoie la longueur d'une sous-chaîne analysée en C++."
type: docs
weight: 1000
url: /fr/cpp/system.net.http.headers/namevalueheadervalue/getnamevaluelistlength/
---
## NameValueHeaderValue::GetNameValueListLength method


Convertit une chaîne passée à partir de l'index spécifié en la collection d'instances de la classe NameValueHeaderValue‑class et renvoie la longueur d'une sous‑chaîne analysée.

```cpp
static int32_t System::Net::Http::Headers::NameValueHeaderValue::GetNameValueListLength(String input, int32_t startIndex, char16_t delimiter, System::SharedPtr<ObjectCollection<System::SharedPtr<NameValueHeaderValue>>> nameValueCollection)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | String | Une chaîne à analyser. |
| startIndex | int32_t | Une position de départ pour l'analyse. |
| délimiteur | char16_t | Une chaîne utilisée pour délimiter les éléments dans la chaîne spécifiée. |
| nameValueCollection | System::SharedPtr\<ObjectCollection\<System::SharedPtr\<NameValueHeaderValue\>\>\> | Le paramètre de sortie où une collection analysée sera assignée. |

### ReturnValue

La longueur d'une sous-chaîne analysée.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ObjectCollection](../../objectcollection/)
* Class [NameValueHeaderValue](../)
* Class [NameValueHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
