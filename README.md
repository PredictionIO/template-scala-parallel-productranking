# Product Ranking Template

## Development Notes

### import sample data

```
$ python data/import_eventserver.py --access_key
```

### query

```
curl -H "Content-Type: application/json" \
-d '{ "user": "u2", "items": ["i1", "i3", "i10", "i2", "i5", "i31", "i9"]}' \
http://localhost:8000/queries.json \
-w %{time_connect}:%{time_starttransfer}:%{time_total}
```
