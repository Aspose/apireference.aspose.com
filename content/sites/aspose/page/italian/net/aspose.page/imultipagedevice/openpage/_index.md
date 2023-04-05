---
title: IMultiPageDevice.OpenPage
second_title: Aspose.Page per riferimento all'API .NET
description: IMultiPageDevice metodo. Rende necessaria la preparazione del dispositivo prima del rendering della pagina.
type: docs
weight: 40
url: /it/net/aspose.page/imultipagedevice/openpage/
---
## OpenPage(string) {#openpage_1}

Rende necessaria la preparazione del dispositivo prima del rendering della pagina.

```csharp
public bool OpenPage(string title)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| title | String | Il titolo della pagina. |

### Valore di ritorno

True se la pagina è compresa nell'intervallo richiesto, altrimenti false. Utilizzato nei dispositivi che possono eseguire il rendering dell'array specificato di numeri di pagina.

### Guarda anche

* interface [IMultiPageDevice](../)
* spazio dei nomi [Aspose.Page](../../imultipagedevice/)
* assemblea [Aspose.Page](../../../)

---

## OpenPage(float, float) {#openpage}

Rende necessaria la preparazione del dispositivo prima di ogni rendering della pagina.

```csharp
public bool OpenPage(float width, float height)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| width | Single | Una larghezza della pagina. |
| height | Single | Un'altezza della pagina. |

### Valore di ritorno

Restituisce vero se la pagina aperta ha un numero che rientra in un intervallo di numeri di pagina selezionati e falso in caso contrario.

### Guarda anche

* interface [IMultiPageDevice](../)
* spazio dei nomi [Aspose.Page](../../imultipagedevice/)
* assemblea [Aspose.Page](../../../)


