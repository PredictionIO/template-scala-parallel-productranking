# Product Ranking Engine Template

## Documentation

Please refer to http://predictionio.incubator.apache.org/templates/productranking/quickstart/

## Version

### v0.4.0
- update for PredictionIO 0.13.0

### v0.3.0

- update for PredictionIO 0.9.2, including:

  - use new PEventStore API
  - use appName in DataSource parameter

### v0.2.0

- update build.sbt and template.json for PredictionIO 0.9.2

### v0.1.1

- update for PredictionIO 0.9.0

### v0.1.0

- initial version


## Development Notes

### import sample data

```
$ python data/import_eventserver.py --access_key <your access key>
```

### query

normal:

```
curl -H "Content-Type: application/json" \
-d '{ "user": "u2", "items": ["i1", "i3", "i10", "i2", "i5", "i31", "i9"]}' \
http://localhost:8000/queries.json \
-w %{time_connect}:%{time_starttransfer}:%{time_total}
```

unknown user:

```
curl -H "Content-Type: application/json" \
-d '{ "user": "unknown_user", "items": ["i1", "i3", "i10", "i2", "i5", "i31", "i9"]}' \
http://localhost:8000/queries.json \
-w %{time_connect}:%{time_starttransfer}:%{time_total}
```

unknown item:

```
curl -H "Content-Type: application/json" \
-d '{ "user": "u3", "items": ["unk1", "i3", "i10", "i2", "i9"]}' \
http://localhost:8000/queries.json \
-w %{time_connect}:%{time_starttransfer}:%{time_total}
```

all unknown items:

```
curl -H "Content-Type: application/json" \
-d '{ "user": "u4", "items": ["unk1", "unk2", "unk3", "unk4"]}' \
http://localhost:8000/queries.json \
-w %{time_connect}:%{time_starttransfer}:%{time_total}
```
