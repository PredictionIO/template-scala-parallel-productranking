"""
Send sample query to prediction engine
"""

import predictionio
engine_client = predictionio.EngineClient(url="http://localhost:8000")
print engine_client.send_query({
  "user": "u2",
  "items": ["i1", "i3", "i10", "i2", "i5", "i31", "i9"]
  })
