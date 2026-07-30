---
title: "System::Net::Http::Headers::HttpContentHeaders classe"
linktitle: "HttpContentHeaders"
second_title: "Aspose.Font pour C++"
description: "System::Net::Http::Headers::HttpContentHeaders classe. Représente la collection des en-têtes ''Content''. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument en C++."
type: docs
weight: 600
url: /fr/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


Représente la collection des en-têtes 'Content'. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou en utilisant l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des fautes d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour le transmettre aux fonctions en tant qu'argument.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | Ajoute les en-têtes connus à la collection spécifiée. |
| [get_Allow](./get_allow/)() | Informations RTTI. |
| [get_ContentDisposition](./get_contentdisposition/)() | Obtient la valeur de l'en-tête 'Content-Disposition'. |
| [get_ContentEncoding](./get_contentencoding/)() | Obtient la valeur de l'en-tête 'Content-Encoding'. |
| [get_ContentLanguage](./get_contentlanguage/)() | Obtient la valeur de l'en-tête 'Content-Language'. |
| [get_ContentLength](./get_contentlength/)() | Obtient la valeur de l'en-tête 'Content-Length'. |
| [get_ContentLocation](./get_contentlocation/)() | Obtient la valeur de l'en-tête 'Content-Location'. |
| [get_ContentMD5](./get_contentmd5/)() | Obtient une valeur de l'en-tête 'Content-MD5'. |
| [get_ContentRange](./get_contentrange/)() | Obtient une valeur de l'en-tête 'Content-Range'. |
| [get_ContentType](./get_contenttype/)() | Obtient une valeur de l'en-tête 'Content-Type'. |
| [get_Expires](./get_expires/)() | Obtient une valeur de l'en-tête 'Expires'. |
| [get_LastModified](./get_lastmodified/)() | Obtient une valeur de l'en-tête 'Last-Modified'. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | Construit une nouvelle instance. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | Définit une valeur de l'en-tête 'Content-Disposition'. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | Définit une valeur de l'en-tête 'Content-Length'. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | Définit une valeur de l'en-tête 'Content-Location'. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | Définit une valeur de l'en-tête 'Content-MD5'. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | Définit une valeur de l'en-tête 'Content-Range'. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | Définit une valeur de l'en-tête 'Content-Type'. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | Définit une valeur de l'en-tête 'Expires'. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | Définit une valeur de l'en-tête 'Last-Modified'. |
## Voir aussi

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Font for C++](../../)
