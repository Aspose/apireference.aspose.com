---
title: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength méthode"
linktitle: "ObtenirMediaTypeLongueur"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength méthode. Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe MediaTypeHeaderValue en C++."
type: docs
weight: 1000
url: /fr/cpp/system.net.http.headers/mediatypeheadervalue/getmediatypelength/
---
## MediaTypeHeaderValue::GetMediaTypeLength method


Convertit une chaîne passée à partir de l'index spécifié en une instance de la classe [MediaTypeHeaderValue](../).

```cpp
static int32_t System::Net::Http::Headers::MediaTypeHeaderValue::GetMediaTypeLength(String input, int32_t startIndex, HeaderFunc<System::SharedPtr<MediaTypeHeaderValue>> mediaTypeCreator, System::SharedPtr<MediaTypeHeaderValue> &parsedValue)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| input | String | Une chaîne à analyser. |
| startIndex | int32_t | Une position de départ pour l'analyse. |
| mediaTypeCreator | HeaderFunc\<System::SharedPtr\<MediaTypeHeaderValue\>\> | Le délégué utilisé pour créer des instances de la classe [MediaTypeHeaderValue](../). |
| parsedValue | System::SharedPtr\<MediaTypeHeaderValue\>\& | Une instance où un objet analysé sera assigné. |

### ReturnValue

Renvoie la longueur d'une sous-chaîne analysée, sinon 0.

## Voir aussi

* Class [String](../../../system/string/)
* Typedef [HeaderFunc](../../headerfunc/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [MediaTypeHeaderValue](../)
* Class [MediaTypeHeaderValue](../)
* Namespace [System::Net::Http::Headers](../../)
* Library [Aspose.Font for C++](../../../)
