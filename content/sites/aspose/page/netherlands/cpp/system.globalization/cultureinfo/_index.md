---
title: "System::Globalization::CultureInfo klasse"
linktitle: "CultureInfo"
second_title: "Aspose.Page voor C++"
description: "System::Globalization::CultureInfo klasse. Collectie van cultuurspecifieke waarden en algoritmen. Setter‑bewerkingen zijn alleen ingeschakeld voor objecten die niet alleen-lezen zijn. Objecten van deze klasse mogen alleen worden gealloceerd met de functie System::MakeObject(). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een System::SmartPtr‑pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 500
url: /nl/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


Collectie van cultuurspecifieke waarden en algoritmen. Setter‑bewerkingen zijn alleen ingeschakeld voor objecten die niet alleen-lezen zijn. Objecten van deze klasse mogen alleen worden gealloceerd met de functie [System::MakeObject()](../../system/makeobject/). Maak nooit een instantie van dit type op de stack of met operator new, omdat dit runtime‑fouten en/of assertiefouten oplevert. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/) pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | Vernieuwt gecachte cultuursinformatie. |
| [Clone](./clone/)() override | Kloont cultuursinformatie. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | Maakt cultuur aan op basis van naam. |
| explicit [CultureInfo](./cultureinfo/)(int) | RTTI-informatie. |
| [CultureInfo](./cultureinfo/)(int, bool) | Constructor. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | Constructor. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | Constructor. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | Gooit altijd ArgumentNullException. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Vergelijkt objecten. |
| virtual [get_Calendar](./get_calendar/)() const | Haalt de kalender op die door de cultuur wordt gebruikt. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | Haalt de stringvergelijker op die voldoet aan de cultuurrichtlijnen. |
| [get_CultureTypes](./get_culturetypes/)() const | Haalt de bitwise‑samenvoeging van cultuurtypes op die de huidige cultuur beschrijven. |
| static [get_CurrentCulture](./get_currentculture/)() | Haalt de cultuur op die is ingesteld voor de huidige thread. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | Haalt de UI‑cultuur van de huidige thread op. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | Haalt datumopmaak‑informatie op. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | Haalt de standaardcultuur op in het huidige toepassingsdomein. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | Haalt de standaard UI‑cultuur op in het huidige toepassingsdomein. |
| virtual [get_DisplayName](./get_displayname/)() const | Haalt de weergavenaam van de cultuur op. |
| virtual [get_EnglishName](./get_englishname/)() const | Haalt de Engelse naam van de cultuur op. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | Haalt de RFC‑4646‑naam op voor een taal. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | Haalt de cultuur op die met het besturingssysteem is geïnstalleerd. |
| static [get_InvariantCulture](./get_invariantculture/)() | Haalt de invariante cultuur op. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | Controleert of de cultuur neutraal is. |
| [get_IsReadOnly](./get_isreadonly/)() const | Controleert of het cultuurobject alleen-lezen is. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | Haalt de actieve invoerlocale‑identificatie op. |
| virtual [get_LCID](./get_lcid/)() const | Haalt de cultuuraanduiding op. |
| virtual [get_Name](./get_name/)() const | Haalt de cultuurnaam op. |
| virtual [get_NativeName](./get_nativename/)() const | Haalt de oorspronkelijke cultuurnaam op. |
| virtual [get_NumberFormat](./get_numberformat/)() const | Haalt informatie over getalnotatie op. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | Lijst van kalenders die met de cultuur kunnen worden gebruikt. |
| virtual [get_Parent](./get_parent/)() const | Haalt de bovenliggende cultuur op. |
| virtual [get_TextInfo](./get_textinfo/)() const | Haalt de tekstopmaakparameters op die door de cultuur worden gebruikt. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | Haalt de drieletterige ISO 639-2‑taalcode op. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | Haalt de drieletterige code voor de taal op zoals gedefinieerd in de [Windows](../../system.windows/)‑API. |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | Haalt de tweeletterige ISO‑taalnaam op die aan de cultuur is gekoppeld. |
| [get_UseUserOverride](./get_useuseroverride/)() const | Haalt een vlag op die aangeeft of de [CultureInfo](./) gebruikers‑geselecteerde cultuuropties gebruikt. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | Haalt een alternatieve cultuur op die geschikt is voor console‑toepassingen. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | Haalt de cultuur op op basis van de naam. Hetzelfde als CreateSpecificCulture. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | Haalt de cultuur op op basis van de naam. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | Haalt de cultuur op op basis van ID. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | Verouderd. Haalt een alleen-lezen [CultureInfo](./)‑object op op basis van de opgegeven RFC‑4646‑taaltag. |
| static [GetCultures](./getcultures/)(CultureTypes) | Haalt culturen op die tot de opgegeven types behoren. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Haalt het opmaakobject op voor een specifiek type. |
| [GetHashCode](./gethashcode/)() const override | Retourneert de hashcode van het object. |
| [IsInherited](./isinherited/)() const | Haalt de geërfde‑vlag op. VOOR INTERN GEBRUIK. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | Vergelijkt cultuuropties. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | Haalt een alleen‑lezen versie van de cultuur op. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | Stelt de cultuur in voor de huidige thread. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | Stelt de UI‑cultuur van de huidige thread in. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | Stelt datumopmaakinformatie in. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | Stelt de standaardcultuur in het huidige toepassingsdomein in. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | Stelt de standaard UI-cultuur in het huidige toepassingsdomein in. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | Haalt informatie over getalnotatie op. |
| [ToString](./tostring/)() const override | Converteert cultuur naar een string. |
## Zie ook

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
