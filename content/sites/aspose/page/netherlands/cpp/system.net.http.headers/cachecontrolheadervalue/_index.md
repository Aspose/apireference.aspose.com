---
title: "System::Net::Http::Headers::CacheControlHeaderValue klasse"
linktitle: "CacheControlHeaderValue"
second_title: "Aspose.Page voor C++"
description: "System::Net::Http::Headers::CacheControlHeaderValue klasse. Vertegenwoordigt een waarde van de ''Cache-Control'' header. Objecten van deze klasse mogen alleen worden toegewezen met de System::MakeObject() functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze door te geven aan functies als argument in C++."
type: docs
weight: 200
url: /nl/cpp/system.net.http.headers/cachecontrolheadervalue/
---
## CacheControlHeaderValue class


Vertegenwoordigt een waarde van de 'Cache-Control' header. Objecten van deze klasse mogen alleen worden toegewezen met de [System::MakeObject()](../../system/makeobject/) functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit zal leiden tot runtime‑fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze door te geven aan functies als argument.

```cpp
class CacheControlHeaderValue : public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [CacheControlHeaderValue](./cachecontrolheadervalue/)() | Construeert een nieuw exemplaar. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | Vergelijkt objecten met behulp van C# [Object.Equals](../../system/object/equals/) semantiek. |
| [get_Extensions](./get_extensions/)() | Retourneert de collectie van de cache‑extension‑tokens. |
| [get_MaxAge](./get_maxage/)() | Haalt de maximale leeftijdwaarde in seconden op die de tijd bepaalt waarin de client een respons accepteert. |
| [get_MaxStale](./get_maxstale/)() | Haalt de waarde op die bepaalt of de client verlopen reacties accepteert. |
| [get_MaxStaleLimit](./get_maxstalelimit/)() | Haalt de waarde in seconden op die de tijd bepaalt waarin de client verlopen reacties accepteert. |
| [get_MinFresh](./get_minfresh/)() | Haalt de waarde op die de levensduur van de versheid bepaalt. |
| [get_MustRevalidate](./get_mustrevalidate/)() | Haalt de waarde op die bepaalt of de server hervalidatie van een cache‑item vereist wanneer het verouderd raakt. |
| [get_NoCache](./get_nocache/)() | RTTI-informatie. |
| [get_NoCacheHeaders](./get_nocacheheaders/)() | Haalt de collectie van veldnamen op in de 'no-cache' directive in de 'Cache-Control' header. |
| [get_NoStore](./get_nostore/)() | Haalt de waarde op die bepaalt of een cache geen enkel deel van een HTTP‑verzoek of -respons mag opslaan. |
| [get_NoTransform](./get_notransform/)() | Haalt de waarde op die bepaalt of een cache of proxy geen enkel deel van de entiteits‑body mag wijzigen. |
| [get_OnlyIfCached](./get_onlyifcached/)() | Haalt de waarde op die bepaalt of de client alleen gecachte items mag gebruiken. |
| [get_Private](./get_private/)() | Haalt de waarde op die bepaalt of het HTTP‑responsbericht of een deel ervan bedoeld is voor één gebruiker en niet mag worden gecached door een gedeelde cache. |
| [get_PrivateHeaders](./get_privateheaders/)() | Haalt de collectie van veldnamen op in de 'private' directive in de 'Cache-Control' header. |
| [get_ProxyRevalidate](./get_proxyrevalidate/)() | Haalt de waarde op die bepaalt of de server hervalidatie van een cache‑item vereist wanneer het verouderd raakt voor de gedeelde user‑agent caches. |
| [get_Public](./get_public/)() | Haalt de waarde op die bepaalt of een HTTP‑respons door enige cache kan worden gecached. |
| [get_SharedMaxAge](./get_sharedmaxage/)() | Haalt de gedeelde maximale leeftijdwaarde in seconden op die de 'max-age' directive in de 'Cache-Control' header of de 'Expires' header voor een gedeelde cache overschrijft. |
| static [GetCacheControlLength](./getcachecontrollength/)(String, int32_t, System::SharedPtr\<CacheControlHeaderValue\>, System::SharedPtr\<CacheControlHeaderValue\>\&) | Converteert een meegegeven string vanaf de opgegeven index naar een instantie van de [CacheControlHeaderValue](./) klasse. |
| [GetHashCode](./gethashcode/)() const override | Analoge van C# [Object.GetHashCode()](../../system/object/gethashcode/) methode. Maakt hashing van aangepaste objecten mogelijk. |
| static [Parse](./parse/)(String) | Converteert een meegegeven string naar een instantie van de [CacheControlHeaderValue](./) klasse. |
| [set_MaxAge](./set_maxage/)(Nullable\<TimeSpan\>) | Stelt de maximale leeftijdwaarde in seconden in die de tijd bepaalt waarin de client een respons accepteert. |
| [set_MaxStale](./set_maxstale/)(bool) | Stelt de waarde in die bepaalt of de client verlopen reacties accepteert. |
| [set_MaxStaleLimit](./set_maxstalelimit/)(Nullable\<TimeSpan\>) | Stelt de waarde in seconden in die de tijd bepaalt waarin de client verlopen reacties accepteert. |
| [set_MinFresh](./set_minfresh/)(Nullable\<TimeSpan\>) | Stelt de waarde in die de levensduur van de versheid bepaalt. |
| [set_MustRevalidate](./set_mustrevalidate/)(bool) | Stelt de waarde in die bepaalt of de server een hervalidatie van een cache‑item vereist wanneer deze verouderd raakt. |
| [set_NoCache](./set_nocache/)(bool) | Stelt de waarde in die bepaalt of de client een gecachte respons accepteert. |
| [set_NoStore](./set_nostore/)(bool) | Stelt de waarde in die bepaalt of een cache geen enkel deel van een HTTP‑verzoek of -respons mag opslaan. |
| [set_NoTransform](./set_notransform/)(bool) | Stelt de waarde in die bepaalt of een cache of proxy geen enkel deel van de entiteits‑body mag wijzigen. |
| [set_OnlyIfCached](./set_onlyifcached/)(bool) | Stelt de waarde in die bepaalt of de client alleen gecachte items mag gebruiken. |
| [set_Private](./set_private/)(bool) | Stelt de waarde in die bepaalt of het HTTP‑responsbericht of een deel ervan bedoeld is voor één gebruiker en niet mag worden gecached door een gedeelde cache. |
| [set_ProxyRevalidate](./set_proxyrevalidate/)(bool) | Stelt de waarde in die bepaalt of de server een hervalidatie van een cache‑item vereist wanneer deze verouderd raakt voor gedeelde user‑agent‑caches. |
| [set_Public](./set_public/)(bool) | Stelt de waarde in die bepaalt of een HTTP‑respons door enige cache kan worden gecached. |
| [set_SharedMaxAge](./set_sharedmaxage/)(Nullable\<TimeSpan\>) | Stelt de gedeelde maximale leeftijdwaarde in seconden in die de 'max-age'‑directive in de 'Cache-Control'-header of de 'Expires'-header voor een gedeelde cache overschrijft. |
| [ToString](./tostring/)() const override | Analoge van de C# [Object.ToString()](../../system/object/tostring/) methode. Maakt het mogelijk aangepaste objecten naar een string te converteren. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<CacheControlHeaderValue\>\&) | Probeert een opgegeven tekenreeks om te zetten naar een instantie van de [CacheControlHeaderValue](./)‑klasse. |
## Zie ook

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
