import { useEffect, useState } from "react";
import api from "../services/api";
import { LineChart, Line, XAxis, YAxis } from "recharts";

export default function Analytics() {
  const [data, setData] = useState([]);
  const [period, setPeriod] = useState("weekly");

  useEffect(() => {
    api.get(`/analytics?period=${period}`)
      .then(res => setData(res.data));
  }, [period]);

  return (
    <div>
      <h2>Analytics</h2>

      <select onChange={(e) => setPeriod(e.target.value)}>
        <option value="weekly">Weekly</option>
        <option value="monthly">Monthly</option>
      </select>

      <LineChart width={500} height={250} data={data}>
        <XAxis dataKey="name" />
        <YAxis />
        <Line type="monotone" dataKey="value" />
      </LineChart>
    </div>
  );
}