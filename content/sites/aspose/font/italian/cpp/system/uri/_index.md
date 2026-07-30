---
title: "Classe System::Uri"
linktitle: "Uri"
second_title: "Aspose.Font per C++"
description: "Classe System::Uri. Identificatore di risorsa unificato. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 6700
url: /it/cpp/system/uri/
---
## Uri class


Identificatore di risorsa unificato. Gli oggetti di questa classe dovrebbero essere allocati solo usando la funzione [System::MakeObject()](../makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fallimenti di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class Uri : public System::Object
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| static [CheckHostName](./checkhostname/)(String) | Determina il tipo del nome host specificato. |
| static [CheckSchemeName](./checkschemename/)(const String\&) | Determina se lo schema specificato è valido. |
| static [Compare](./compare/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, UriComponents, UriFormat, StringComparison) | Confronta gli oggetti [Uri](./) specificati usando le regole di confronto specificate. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Determina se gli URI rappresentati dagli oggetti corrente e specificato sono uguali. |
| static [EscapeDataString](./escapedatastring/)(const String\&) | Converte una stringa nella sua rappresentazione escaped. |
| static [EscapeUriString](./escapeuristring/)(const String\&) | Converte una stringa URI nella sua rappresentazione escaped. |
| static [FromHex](./fromhex/)(char16_t) | Ottiene il valore decimale di una cifra esadecimale. |
| [get_AbsolutePath](./get_absolutepath/)() const | Restituisce il percorso assoluto dell'URI. |
| [get_AbsoluteUri](./get_absoluteuri/)() const | Restituisce l'URI assoluto. |
| [get_Authority](./get_authority/)() const | Restituisce il nome host e il numero di porta per un server. |
| [get_DnsSafeHost](./get_dnssafehost/)() const | Restituisce un nome host non codificato. |
| [get_Fragment](./get_fragment/)() const | Restituisce il frammento URI codificato. |
| [get_Host](./get_host/)() const | Restituisce il nome host. |
| [get_HostNameType](./get_hostnametype/)() const | Restituisce il tipo di nome host. |
| [get_IdnHost](./get_idnhost/)() const | Restituisce un Nome di Dominio Internazionale dell'host. |
| [get_IsAbsoluteUri](./get_isabsoluteuri/)() const | Determina se l'URI rappresentato dall'oggetto corrente è assoluto. |
| [get_IsDefaultPort](./get_isdefaultport/)() const | Determina se l'URI rappresentato dall'oggetto corrente ha la porta predefinita per lo schema dell'URI. |
| [get_IsFile](./get_isfile/)() const | Determina se l'URI rappresentato dall'oggetto corrente è un file. |
| [get_IsLoopback](./get_isloopback/)() const | Determina se l'URI rappresentato dall'oggetto corrente fa riferimento a un host locale. |
| [get_IsUnc](./get_isunc/)() const | Determina se l'URI rappresentato dall'oggetto corrente è un percorso UNC. |
| [get_LocalPath](./get_localpath/)() const | Restituisce la rappresentazione del sistema operativo del nome file a cui fa riferimento l'URI rappresentato dall'oggetto corrente. |
| [get_OriginalString](./get_originalstring/)() const | Restituisce la stringa URI passata al costruttore quando è stato creato l'oggetto corrente. |
| [get_PathAndQuery](./get_pathandquery/)() const | Restituisce il percorso assoluto e le componenti di query dell'URI rappresentato dall'oggetto corrente, separati da un punto interrogativo (?). |
| [get_Port](./get_port/)() const | Restituisce il numero di porta dell'URI rappresentato dall'oggetto corrente. |
| [get_Query](./get_query/)() const | Restituisce le informazioni di query incluse nell'URI rappresentato dall'oggetto corrente. |
| [get_Scheme](./get_scheme/)() const | Restituisce lo schema dell'URI rappresentato dall'oggetto corrente. |
| [get_Segments](./get_segments/)() const | Restituisce un array di stringhe contenente i segmenti di percorso dell'URI rappresentato dall'oggetto corrente. |
| [get_UserEscaped](./get_userescaped/)() const | Determina se la stringa URI passata al costruttore dell'oggetto corrente era completamente codificata. |
| [get_UserInfo](./get_userinfo/)() const | Restituisce un nome utente, password e altre informazioni sull'utente associate all'URI rappresentato dall'oggetto corrente. |
| [GetComponents](./getcomponents/)(UriComponents, UriFormat) const | Restituisce i componenti specificati dell'URI rappresentato dall'oggetto corrente utilizzando la codifica specificata. |
| [GetHashCode](./gethashcode/)() const override | Ottiene il codice hash per l'URI. |
| [GetLeftPart](./getleftpart/)(UriPartial) | Restituisce la porzione specificata dell'URI rappresentato dall'oggetto corrente. |
| static [HexEscape](./hexescape/)(char16_t) | Restituisce l'equivalente esadecimale del carattere specificato. |
| static [HexUnescape](./hexunescape/)(const String\&, int32_t\&) | Converte la rappresentazione esadecimale specificata di un carattere in un carattere. |
| [IsBaseOf](./isbaseof/)(const SharedPtr\<Uri\>\&) const | Determina se l'URI rappresentato dall'oggetto [Uri](./) corrente è una base dell'URI rappresentato dall'oggetto [Uri](./) specificato. |
| static [IsHexDigit](./ishexdigit/)(char16_t) | Determina se il carattere specificato rappresenta una cifra esadecimale valida. |
| static [IsHexEncoding](./ishexencoding/)(const String\&, int32_t) | Determina se un carattere nella stringa specificata nella posizione specificata è codificato esadecimale. |
| [IsWellFormedOriginalString](./iswellformedoriginalstring/)() const | Indica se la stringa usata per costruire questo [Uri](./) era ben formata e non è necessario eseguirne ulteriori escape. |
| static [IsWellFormedUriString](./iswellformeduristring/)(const String\&, UriKind) | Determina se la stringa specificata è un URI ben formato. |
| [MakeRelative](./makerelative/)(const SharedPtr\<Uri\>\&) | Determina la differenza tra due istanze di [Uri](./). |
| [MakeRelativeUri](./makerelativeuri/)(const SharedPtr\<Uri\>\&) | Determina la differenza tra gli URI rappresentati dall'oggetto corrente e dall'oggetto [Uri](./) specificato. |
| [ToString](./tostring/)() const override | Restituisce la rappresentazione stringa dell'URI rappresentato dall'oggetto corrente. |
| static [TryCreate](./trycreate/)(const String\&, UriKind, SharedPtr\<Uri\>\&) | Crea un oggetto [Uri](./) che rappresenta l'URI specificato; un argomento specifica il tipo di URI. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const String\&, SharedPtr\<Uri\>\&) | Crea un oggetto [Uri](./) a partire dall'oggetto [Uri](./) specificato che rappresenta l'URI di base e dalla rappresentazione stringa dell'URI relativo. |
| static [TryCreate](./trycreate/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&, SharedPtr\<Uri\>\&) | Crea un oggetto [Uri](./) a partire dagli URI di base e relativi specificati. |
| static [UnescapeDataString](./unescapedatastring/)(const String\&) | Rimuove l'escape dalla stringa specificata. |
| [Uri](./uri/)(const String\&) | Crea un oggetto [Uri](./) che rappresenta l'URI specificato. |
| [Uri](./uri/)(const String\&, bool) | Crea un oggetto [Uri](./) che rappresenta l'URI specificato; un argomento indica se l'URI deve essere escaped. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&, bool) | Crea un oggetto [Uri](./) a partire dall'oggetto [Uri](./) specificato che rappresenta l'URI di base e dalla rappresentazione stringa dell'URI relativo; un argomento indica se l'URI deve essere escaped. |
| [Uri](./uri/)(const String\&, UriKind) | Crea un oggetto [Uri](./) che rappresenta l'URI specificato; un argomento specifica il tipo di URI. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const String\&) | Crea un oggetto [Uri](./) a partire dagli URI di base e relativi specificati. |
| [Uri](./uri/)(const SharedPtr\<Uri\>\&, const SharedPtr\<Uri\>\&) | Crea un oggetto [Uri](./) a partire dagli URI di base e relativi specificati. |
## Campi

| Campo | Descrizione |
| --- | --- |
| static [SchemeDelimiter](./schemedelimiter/) | Specifica i caratteri che separano lo schema del protocollo di comunicazione dalla parte dell'indirizzo del [Uri](./). |
| static [UriSchemeFile](./urischemefile/) | Specifica che il [Uri](./) è un puntatore a un file. |
| static [UriSchemeFtp](./urischemeftp/) | Specifica che il [Uri](./) è accessibile tramite il File Transfer Protocol. |
| static [UriSchemeGopher](./urischemegopher/) | Specifica che il [Uri](./) è accessibile tramite il protocollo Gopher. |
| static [UriSchemeHttp](./urischemehttp/) | Specifica che il [Uri](./) è accessibile tramite l'Hypertext Transfer Protocol. |
| static [UriSchemeHttps](./urischemehttps/) | Specifica che il [Uri](./) è accessibile tramite il Secure Hypertext Transfer Protocol. |
| static [UriSchemeMailto](./urischememailto/) | Specifica che il [Uri](./) è un indirizzo email ed è accessibile tramite il Simple Mail Transport Protocol. |
| static [UriSchemeNetPipe](./urischemenetpipe/) | Specifica che il [Uri](./) è accessibile tramite lo schema NetPipe utilizzato da [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNetTcp](./urischemenettcp/) | Specifica che il [Uri](./) è accessibile tramite lo schema NetTcp utilizzato da [Windows](../../system.windows/) Communication Foundation. |
| static [UriSchemeNews](./urischemenews/) | Specifica che il [Uri](./) è un gruppo di notizie Internet ed è accessibile tramite il Network News Transport Protocol. |
| static [UriSchemeNntp](./urischemenntp/) | Specifica che il [Uri](./) è un gruppo di notizie Internet ed è accessibile tramite il Network News Transport Protocol. |
## Osservazioni



```cpp
#include "system/smart_ptr.h"
#include "system/uri.h"
#include <iostream>

int main()
{
  const auto uri = System::MakeObject<System::Uri>(u"https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/");

std::cout <<
  "AbsolutePath: " << uri->get_AbsolutePath() << std::endl <<
  "AbsoluteUri: " << uri->get_AbsoluteUri() << std::endl <<
  "Authority: " << uri->get_Authority() << std::endl <<
  "DnsSafeHost: " << uri->get_DnsSafeHost() << std::endl <<
  "Fragment: " << uri->get_Fragment() << std::endl <<
  "Host: " << uri->get_Host() << std::endl <<
  "IdnHost: " << uri->get_IdnHost() << std::endl <<
  "LocalPath: " << uri->get_LocalPath() << std::endl <<
  "OriginalString: " << uri->get_OriginalString() << std::endl <<
  "PathAndQuery: " << uri->get_PathAndQuery() << std::endl <<
  "Port: " << uri->get_Port() << std::endl <<
  "Query: " << uri->get_Query() << std::endl <<
  "Scheme: " << uri->get_Scheme() << std::endl;

  return 0;
}
/*
This code example produces the following output:
AbsolutePath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
AbsoluteUri: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Authority: docs.codeporting.com
DnsSafeHost: docs.codeporting.com
Fragment:
Host: docs.codeporting.com
IdnHost: docs.codeporting.com
LocalPath: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
OriginalString: https://docs.codeporting.com/translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
PathAndQuery: /translator/cs2cpp/release-notes/2021/codeporting-translator-cs2cpp-21-9/
Port: 443
Query:
Scheme: https
*/
```

## Vedi anche

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
