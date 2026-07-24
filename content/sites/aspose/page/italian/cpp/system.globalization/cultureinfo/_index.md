---
title: "classe System::Globalization::CultureInfo"
linktitle: "CultureInfo"
second_title: "Aspose.Page per C++"
description: "Classe System::Globalization::CultureInfo. Raccolta di valori e algoritmi specifici per la cultura. Le operazioni di impostazione sono abilitate solo su oggetti non di sola lettura. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore System::SmartPtr e usa questo puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 500
url: /it/cpp/system.globalization/cultureinfo/
---
## CultureInfo class


Raccolta di valori e algoritmi specifici per la cultura. Le operazioni di impostazione sono abilitate solo su oggetti non di sola lettura. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò proverà errori di runtime e/o fault di asserzione. Avvolgi sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e usa questo puntatore per passarlo alle funzioni come argomento.

```cpp
class CultureInfo : public virtual System::Object,
                    public System::IFormatProvider,
                    public System::ICloneable
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [ClearCachedData](./clearcacheddata/)() | Aggiorna le informazioni culturali memorizzate nella cache. |
| [Clone](./clone/)() override | Clona le informazioni culturali. |
| static [CreateSpecificCulture](./createspecificculture/)(const String\&) | Crea una cultura per nome. |
| explicit [CultureInfo](./cultureinfo/)(int) | Informazioni RTTI. |
| [CultureInfo](./cultureinfo/)(int, bool) | Costruttore. |
| explicit [CultureInfo](./cultureinfo/)(const String\&) | Costruttore. |
| [CultureInfo](./cultureinfo/)(const String\&, bool) | Costruttore. |
| [CultureInfo](./cultureinfo/)(std::nullptr_t) | Lancia sempre ArgumentNullException. |
| [Equals](./equals/)(SharedPtr\<Object\>) override | Confronta gli oggetti. |
| virtual [get_Calendar](./get_calendar/)() const | Ottiene il calendario usato dalla cultura. |
| virtual [get_CompareInfo](./get_compareinfo/)() const | Ottiene il comparatore di stringhe che aderisce alle regole della cultura. |
| [get_CultureTypes](./get_culturetypes/)() const | Ottiene l'unione bitwise dei tipi di cultura che descrivono la cultura corrente. |
| static [get_CurrentCulture](./get_currentculture/)() | Ottiene la cultura impostata per il thread corrente. |
| static [get_CurrentUICulture](./get_currentuiculture/)() | Ottiene la cultura UI del thread corrente. |
| virtual [get_DateTimeFormat](./get_datetimeformat/)() const | Ottiene le informazioni sul formato della data. |
| static [get_DefaultThreadCurrentCulture](./get_defaultthreadcurrentculture/)() | Ottiene la cultura predefinita nel dominio dell'applicazione corrente. |
| static [get_DefaultThreadCurrentUICulture](./get_defaultthreadcurrentuiculture/)() | Ottiene la cultura UI predefinita nel dominio dell'applicazione corrente. |
| virtual [get_DisplayName](./get_displayname/)() const | Ottiene il nome visualizzato della cultura. |
| virtual [get_EnglishName](./get_englishname/)() const | Ottiene il nome inglese della cultura. |
| [get_IetfLanguageTag](./get_ietflanguagetag/)() const | Ottiene il nome RFC 4646 per una lingua. |
| static [get_InstalledUICulture](./get_installeduiculture/)() | Ottiene la cultura installata con il sistema operativo. |
| static [get_InvariantCulture](./get_invariantculture/)() | Ottiene la cultura invariata. |
| virtual [get_IsNeutralCulture](./get_isneutralculture/)() const | Verifica se la cultura è neutra. |
| [get_IsReadOnly](./get_isreadonly/)() const | Verifica se l'oggetto cultura è di sola lettura. |
| virtual [get_KeyboardLayoutId](./get_keyboardlayoutid/)() const | Ottiene l'identificatore locale di input attivo. |
| virtual [get_LCID](./get_lcid/)() const | Ottiene l'identificatore della cultura. |
| virtual [get_Name](./get_name/)() const | Ottiene il nome della cultura. |
| virtual [get_NativeName](./get_nativename/)() const | Ottiene il nome nativo della cultura. |
| virtual [get_NumberFormat](./get_numberformat/)() const | Ottiene le informazioni sul formato numerico. |
| virtual [get_OptionalCalendars](./get_optionalcalendars/)() const | Elenco dei calendari che possono essere usati con la cultura. |
| virtual [get_Parent](./get_parent/)() const | Ottiene la cultura padre. |
| virtual [get_TextInfo](./get_textinfo/)() const | Ottiene i parametri di testo usati dalla cultura. |
| virtual [get_ThreeLetterISOLanguageName](./get_threeletterisolanguagename/)() const | Ottiene il codice lingua ISO 639-2 a tre lettere. |
| virtual [get_ThreeLetterWindowsLanguageName](./get_threeletterwindowslanguagename/)() const | Ottiene il codice a tre lettere per la lingua come definito nell'API [Windows](../../system.windows/). |
| virtual [get_TwoLetterISOLanguageName](./get_twoletterisolanguagename/)() const | Ottiene il nome lingua ISO a due lettere associato alla cultura. |
| [get_UseUserOverride](./get_useuseroverride/)() const | Ottiene un flag che indica se il [CultureInfo](./) utilizza le impostazioni culturali selezionate dall'utente. |
| [GetConsoleFallbackUICulture](./getconsolefallbackuiculture/)() const | Ottiene una cultura alternativa adatta alle applicazioni console. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&) | Ottiene la cultura per nome. Identico a CreateSpecificCulture. |
| static [GetCultureInfo](./getcultureinfo/)(const String\&, const String\&) | Ottiene la cultura per nome. |
| static [GetCultureInfo](./getcultureinfo/)(int32_t) | Ottiene la cultura per ID. |
| static [GetCultureInfoByIetfLanguageTag](./getcultureinfobyietflanguagetag/)(const String\&) | Obsoleto. Ottiene un oggetto [CultureInfo](./) di sola lettura tramite il tag linguistico RFC 4646 specificato. |
| static [GetCultures](./getcultures/)(CultureTypes) | Ottiene le culture che rientrano nei tipi specificati. |
| [GetFormat](./getformat/)(const TypeInfo\&) override | Ottiene l'oggetto di formato per il tipo specifico. |
| [GetHashCode](./gethashcode/)() const override | Restituisce il codice hash dell'oggetto. |
| [IsInherited](./isinherited/)() const | Ottiene il flag is-inherited. PER USO INTERNO. |
| [operator=](./operator=/)(const CultureInfo\&) |  |
| [operator==](./operator==/)(const CultureInfo\&) const | Confronta i parametri della cultura. |
| static [ReadOnly](./readonly/)(const CultureInfoPtr\&) | Restituisce una versione di sola lettura della cultura. |
| static [set_CurrentCulture](./set_currentculture/)(const CultureInfoPtr\&) | Imposta la cultura per il thread corrente. |
| static [set_CurrentUICulture](./set_currentuiculture/)(const CultureInfoPtr\&) | Imposta la cultura UI del thread corrente. |
| virtual [set_DateTimeFormat](./set_datetimeformat/)(DateTimeFormatInfoPtr) | Imposta le informazioni sul formato della data. |
| static [set_DefaultThreadCurrentCulture](./set_defaultthreadcurrentculture/)(const CultureInfoPtr\&) | Imposta la cultura predefinita nel dominio dell'applicazione corrente. |
| static [set_DefaultThreadCurrentUICulture](./set_defaultthreadcurrentuiculture/)(const CultureInfoPtr\&) | Imposta la cultura UI predefinita nel dominio dell'applicazione corrente. |
| virtual [set_NumberFormat](./set_numberformat/)(NumberFormatInfoPtr) | Ottiene le informazioni sul formato numerico. |
| [ToString](./tostring/)() const override | Converte la cultura in stringa. |
## Vedi anche

* Class [Object](../../system/object/)
* Class [IFormatProvider](../../system/iformatprovider/)
* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
